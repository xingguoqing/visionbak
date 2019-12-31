package com.xinggq.file.utils;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author xinggq
 * @date 2019-12-04 16:48
 * @description 读取txt文件的工具类
 */
public class ReadTxtUtils {


  /**
   * 将txt文件中内容直接转换为dto，但是前提是：txt中的内容必须是json
   * @param file
   * @param classOfT
   * @param <T>
   * @return
   */
  public static<T> T readToDto(File file,Class<T> classOfT){
    String dtoString = readToString(file);
    Gson gson = new Gson();
    return gson.fromJson(dtoString, classOfT);
  }


  /**
   * 将txt文件中的内容转换为String
   * @param file
   * @return
   */
  public static String readToString(File file) {
    int len = 0;
    StringBuffer str = new StringBuffer();
    try {
      FileInputStream is = new FileInputStream(file);
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader in = new BufferedReader(isr);
      String line = null;
      while ((line = in.readLine()) != null) {
        /**
         *处理换行符的问题
         */
        if (len != 0) {
          str.append("\r\n" + line);
        } else {
          str.append(line);
        }
        len++;
      }
      in.close();
      is.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return str.toString();
  }


}
