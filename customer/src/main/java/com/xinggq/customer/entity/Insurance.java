package com.xinggq.customer.entity;


import com.xinggq.annotation.CheckInsuranceType;
import com.xinggq.response.ICommonCode;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Insurance {

  private String id;
  @CheckInsuranceType(message = ICommonCode.INSURANCE_TYPE_LEGAL)
  private String type;
  private String baseNum;
  @NotEmpty(message = ICommonCode.CUSTOMERID_ISNOT_EMPTY)
  private String customerId;

}
