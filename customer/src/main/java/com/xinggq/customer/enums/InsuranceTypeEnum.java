package com.xinggq.customer.enums;

import lombok.Getter;

/**
 * 保险类型
 *
 * @author xinggq
 * @date 2019-06-26 16:01
 * @description
 */
@Getter
public enum InsuranceTypeEnum {

  /**
   * 商业人寿保险
   */
  SYRSBX("1","商业人寿保险"),
  SB("2","社保");

  private String code;
  private String name;

  InsuranceTypeEnum(String code,String name){
    this.code = code;
    this.name = name;
  }


  private static boolean checkCode(String code){
    InsuranceTypeEnum[] types = InsuranceTypeEnum.values();
    for(InsuranceTypeEnum type : types){
      if(type.code.equals(code)){
        return true;
      }
    }
    return false;
  }


}
