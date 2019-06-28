package com.xinggq.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 私钥处理工具类
 */
public class PrivateKeyUtils {

  private static final Logger logger = LoggerFactory.getLogger(
      PrivateKeyUtils.class);

  private static final String PKCS12 = "pkcs12";

  /**
   *
   * @param inputStream  私钥文件流
   * @param password  私钥密码
   * @return 私钥类
   * @throws CertificateException
   * @throws NoSuchAlgorithmException
   * @throws IOException
   * @throws KeyStoreException
   * @throws UnrecoverableKeyException
   */
  public static PrivateKey loadPrivateKeyOfCA(InputStream inputStream,String password) {
    try{
      KeyStore ks = KeyStore.getInstance(PKCS12);
      ks.load(inputStream, password.toCharArray());
      String alias = ks.aliases().nextElement();
      inputStream.close();
      return (PrivateKey) ks.getKey(alias, password.toCharArray());
    }catch (Exception e){
      logger.error("获取私钥失败，失败原因：{}",e.getMessage());
      return null;
    }finally {
      try {
        if(inputStream != null){
          inputStream.close();
        }
      } catch (IOException e) {
        logger.error("获取私钥失败，失败原因：{}",e.getMessage());
      }
    }
  }

}
