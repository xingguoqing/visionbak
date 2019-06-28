package com.xinggq.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.compression.CompressionCodecs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.util.Map;


public class SignUtils {


  private static final String TESTER = "tester";

  private static final String EINVOICE = "com/yonyou/einvoice";

  private static final String REQUESTDATAS = "requestdatas";

  /**
   * 生成签名值
   *
   * @param param 待签名数据
   * @param file 私钥文件
   * @param password 私钥密码
   * @return 签名值
   */
  public static String createSignByString(String param, File file, String password)
      throws FileNotFoundException {

    InputStream inputStream = new FileInputStream(file);
    PrivateKey privateKey = PrivateKeyUtils.loadPrivateKeyOfCA(inputStream, password);
    Map<String, Object> claims =
        JWTUtils.build().setSubject(TESTER).setIssuer(EINVOICE).setAudience(EINVOICE)
            .addJwtId().addIssuedAt().setExpirySeconds(300).setNotBeforeSeconds(300).getClaims();
    claims.put(REQUESTDATAS, EncryptUtils.getMD5(param));
    return Jwts.builder().signWith(SignatureAlgorithm.RS512, privateKey)
        .setClaims(claims).compressWith(CompressionCodecs.DEFLATE).compact();
  }

  public static String createSignByMap(Map<String, String> paramsMap, File file, String password)
      throws FileNotFoundException {
    return createSignByString(paramsMap.get(REQUESTDATAS), file, password);
  }


}
