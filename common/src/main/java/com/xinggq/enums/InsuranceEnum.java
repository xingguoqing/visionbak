package com.xinggq.enums;

/**
 * @author xinggq
 * @date 2019-07-01 16:44
 * @description
 */
public enum InsuranceEnum {

  /**
   * 商业人寿保险
   */
  SYRSBX("1","商业人寿保险"),
  SB("2","社保");

  private String code;
  private String name;

  InsuranceEnum(String code,String name){
    this.code = code;
    this.name = name;
  }


  public static boolean checkCode(String code){
    InsuranceEnum[] types = InsuranceEnum.values();
    for(InsuranceEnum type : types){
      if(type.code.equals(code)){
        return true;
      }
    }
    return false;
  }


}
