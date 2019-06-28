package com.xinggq.utils;

import java.security.MessageDigest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 加密工具类
 */
public class EncryptUtils {

  private static final Logger logger = LoggerFactory.getLogger(PrivateKeyUtils.class);

  private static final String UTF_8 = "utf-8";

  private static final String MD5 = "MD5";

  private static final String FORMATE = "%02x";

  public static String getMD5(String param) {
    try{
      byte[]  buf = param.getBytes(UTF_8);
      MessageDigest md5 = MessageDigest.getInstance(MD5);
      md5.update(buf);
      byte[] tmp = md5.digest();
      StringBuilder sb = new StringBuilder();
      for (byte b : tmp) {
        sb.append(String.format(FORMATE, b & 0xff));
      }
      return sb.toString();
    }catch (Exception e){
      logger.error("获取MD5值失败，失败原因：",e.getMessage());
      return "";
    }
  }

}
