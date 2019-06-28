package com.xinggq.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

/**
 * 请求体构建工具
 */
public class HttpEntityBuildUtils {


  private static final String SIGN = "sign";

  private static final String APPLICATION_JSON = "application/json";

  private static final String TEST_JSON = "test/json";

  private static final String UTF_8 = "UTF-8";

  public static HttpPost buildJsonHttpPost(String url,String sign,String param){
    HttpPost httpPost = new HttpPost(url);
    httpPost.addHeader(SIGN, sign);
        httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
    StringEntity se = new StringEntity(param, UTF_8);
    se.setContentType(TEST_JSON);
    se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
    httpPost.setEntity(se);
    return httpPost;
  }

  public static HttpPost buildFormHttpPost(String url,String sign,  Map<String, String> param){
    HttpPost httpPost = new HttpPost(url);
    httpPost.addHeader(SIGN, sign);
    List<NameValuePair> list = new ArrayList<NameValuePair>();
    Iterator<Entry<String, String>> iterator = param.entrySet().iterator();
    while (iterator.hasNext()) {
      Entry<String, String> elem = iterator.next();
      list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
    }
    if (list.size() > 0) {
      UrlEncodedFormEntity entity = null;
      try {
        entity = new UrlEncodedFormEntity(list, UTF_8);
      } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
      }
      httpPost.setEntity(entity);
    }
    return httpPost;
  }

}
