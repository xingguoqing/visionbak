package com.xinggq.enums;

import lombok.Getter;

/**
 * 贷款类型
 * @author xinggq
 * @date 2019-06-26 16:04
 * @description
 */
@Getter
public enum LoanTypeEnum {

  /**
   * 车贷
   */
  CAR("1","车贷"),
  /**
   * 房贷
   */
  HOUSE("2","房贷");

  private String code;

  private String name;

  LoanTypeEnum(String code, String name) {
    this.name = name;
    this.code = code;
  }

  public static boolean checkCode(String code){
    LoanTypeEnum[] types = LoanTypeEnum.values();
    for(LoanTypeEnum type : types){
      if(type.code.equals(code)){
        return true;
      }
    }
    return false;
  }
}
