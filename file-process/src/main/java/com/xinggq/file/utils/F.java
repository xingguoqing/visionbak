package com.xinggq.file.utils;

import com.google.common.base.Preconditions;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 文件类型工具类
 *
 * @author baggio
 * @create 2019-03-27 13:26
 **/
public class F {


  public static boolean ispdf(byte[] src){
    return bytesToHexString(src).equals("25504446")?true:false;
  }

  /**
   * 将要读取文件头信息的文件的byte数组转换成string类型表示
   *
   * @param src
   *            要读取文件头信息的文件的byte数组
   * @return 文件头信息
   */
  private static String bytesToHexString(byte[] src) {
    StringBuilder builder = new StringBuilder();
    if (src == null || src.length <= 0) {
      return null;
    }
    String hv;
    for (int i = 0; i < 4; i++) {
      // 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式，并转换为大写
      hv = Integer.toHexString(src[i] & 0xFF).toUpperCase();
      if (hv.length() < 2) {
        builder.append(0);
      }
      builder.append(hv);
    }
    System.out.println(builder.toString());
    return builder.toString();
  }
}

