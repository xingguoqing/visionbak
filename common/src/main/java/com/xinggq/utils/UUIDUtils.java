package com.xinggq.utils;

import java.util.UUID;

/**
 * @author xinggq
 * @date 2019-07-01 10:12
 * @description
 */
public class UUIDUtils {

  /**
   * 生成32位UUID
   * @return
   */
  public static String genUUID(){
    String uuid = UUID.randomUUID().toString();
    uuid = uuid.replace("-", "");
    return uuid;
  }

}
