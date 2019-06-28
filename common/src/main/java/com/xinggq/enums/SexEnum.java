package com.xinggq.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xinggq
 * @date 2019-06-25 18:52
 * @description
 */
@Getter
public enum SexEnum {

  /**
   * 男性
   */
  MAN("1","男"),
  /**
   * 女性
   */
  WOMANV("2","女");

  private String value;

  private String name;

  SexEnum(String value, String name) {
    this.name = name;
    this.value = value;
  }

  public static boolean checkValue(String value){
    if(StringUtils.isEmpty(value)){
      return false;
    }
    SexEnum[] sexs = SexEnum.values();
    for(SexEnum sex : sexs){
      if(sex.getValue().equals(value)){
        return true;
      }
    }
    return false;
  }

}
