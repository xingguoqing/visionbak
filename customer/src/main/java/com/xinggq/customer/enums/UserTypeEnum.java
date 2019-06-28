package com.xinggq.customer.enums;

import lombok.Getter;

/**
 * @author xinggq
 * @date 2019-06-26 14:46
 * @description
 */
@Getter
public enum UserTypeEnum {

  /**
   * 真正的客户
   */
  CUSTOMER("2", "客户"),
  /**
   * 系统使用人员
   */
  USER("1", "系统使用者");

  private String code;

  private String name;

  UserTypeEnum(String code, String name) {
    this.name = name;
    this.code = code;
  }

  private static boolean checkCode(String code){
    UserTypeEnum[] enums = UserTypeEnum.values();
    for(UserTypeEnum userType : enums){
      if(userType.code.equals(code)){
        return true;
      }
    }
    return false;
  }


}
