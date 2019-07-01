package com.xinggq.customer.entity;


import com.xinggq.annotation.CheckPhone;
import com.xinggq.annotation.CheckSex;
import com.xinggq.response.ICommonCode;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {

  private String id;
  @NotEmpty(message = ICommonCode.CUSTOMERNAME_NOT_EMPTY)
  private String name;
  @CheckSex
  private String sex;
  @CheckPhone
  private String phone;
  private String age;
  private String userId;

}
