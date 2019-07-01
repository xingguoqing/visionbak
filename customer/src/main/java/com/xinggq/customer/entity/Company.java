package com.xinggq.customer.entity;


import com.xinggq.response.ICommonCode;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {

  private String id;
  @NotEmpty(message = ICommonCode.COMPANYNAME_ISNOT_EMPTY)
  private String name;
  private String address;
  @NotEmpty(message = ICommonCode.CUSTOMERID_ISNOT_EMPTY)
  private String customerId;

}
