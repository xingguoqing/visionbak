package com.xinggq.file.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author xinggq
 * @date 2019-12-04 16:48
 * @description 读取txt文件的工具类
 */
public class ReadTxtUtils {

  public static void main(String[] args) throws UnsupportedEncodingException {
//    String a = "[{\"card_id\":\"pDe7ajrY4G5z_SIDSauDkLSuF9NI\",\"encrypt_code\":\"O/mPnGTpBu22a1szmK2ogzhFPBh9eYzv2p70L8yzyymSPw4zpNYIVN0JMyArQ9smWamkIJmNOKOqeuDVUynXGoET/M5xpJ226AyphU4tjgdjCI4LuGSoC6vzuiZAb60m\"}]";
//    JSONArray picArray = JSONArray.parseArray(a);
//    JSONObject jsonObject = new JSONObject();
//    jsonObject.put("item_list",picArray);
//    System.out.println(jsonObject.toJSONString());
    try {
      System.out.println(URLEncoder.encode("1231231", "UTF-8"));
    } catch (UnsupportedEncodingException e) {
//      BusiExceptionUtils.wrapBusiException(ICommonResponse.FAIL_CODE, "URL编码异常");
    }
  }


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
