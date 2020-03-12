package com.xinggq.file.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;

/**
 * @author xinggq
 * @date 2019-12-04 17:02
 * @description 图片文件转换工具
 */
public class ImageFilePaser {



  /**
   * ImageIO好像会压缩，
   * @param bytes
   * @param imageName
   * @param postfix
   * @throws Exception
   */
  @Deprecated
  public static void byteToJPG(byte[] bytes, String imageName, String postfix) throws Exception {
    ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
    BufferedImage bi1 = ImageIO.read(bais);
    try {
      File w2 = new File(postfix);
      ImageIO.write(bi1, "jpg", w2);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      bais.close();
    }
  }

  public static void byteToImage(byte[] data, String path) {
    if (data.length < 3 || "".equals(path)) {
      return;
    }
    try {
      FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
      imageOutput.write(data, 0, data.length);
      imageOutput.close();
      System.out.println("Make Picture success,Please find image in " + path);
    } catch (Exception ex) {
      System.out.println("Exception: " + ex);
      ex.printStackTrace();
    }
  }

  public static byte[] imageToBytes(File file)
  {
    FileInputStream fin;
    byte[] bytes = null;
    try {
      fin = new FileInputStream(file);
      bytes  = new byte[fin.available()];
      //将文件内容写入字节数组
      fin.read(bytes);
      fin.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return bytes;
  }


}
