package com.xinggq.utils;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 发送http请求工具类
 */
public class SendHttpRequestUtils {

  private static final Logger logger = LoggerFactory.getLogger(
      SendHttpRequestUtils.class);

  private static final String UTF_8 = "UTF-8";

  private static CloseableHttpClient createSSLClientDefault() {

    try {
      SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
        @Override
        public boolean isTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
          return true;
        }
      }).build();
      SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new HostnameVerifier() {
        @Override
        public boolean verify(String s, SSLSession sslSession) {
          return true;
        }
      });
      return HttpClients.custom().setSSLSocketFactory(sslsf).build();
    } catch (KeyManagementException e) {
      logger.error(e.getMessage());
    } catch (NoSuchAlgorithmException e) {
      logger.error(e.getMessage());
    } catch (KeyStoreException e) {
      logger.error(e.getMessage());
    }
    return HttpClients.createDefault();
  }

  public static String sendPostRequest(HttpPost httpPost) throws IOException {

    //去掉证书校验
//    HttpClient httpClient = HttpClients.custom().build();
    CloseableHttpClient httpClient = createSSLClientDefault();
    return getResponseString(httpClient.execute(httpPost));

  }



  private static String getResponseString(HttpResponse response) throws IOException {
    if (response != null) {
      if (response.getEntity() != null) {
        logger.info("http状态码为："+response.getStatusLine().getStatusCode());
        return EntityUtils.toString(response.getEntity(), UTF_8);
      }
    }
    logger.error("获取请求返回值失败");
    return "";
  }

}
