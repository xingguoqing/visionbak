package com.xinggq.customer.entity;


import com.xinggq.annotation.CheckPhone;
import com.xinggq.annotation.CheckSex;
import com.xinggq.response.ICommonCode;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

  private Long id;
  @NotEmpty(message = ICommonCode.USERNAME_NOT_EMPTY)
  private String name;
  @CheckSex
  private String sex;
  @CheckPhone
  private String phone;
  private String age;
  private String type;
  private Long owner;


}
