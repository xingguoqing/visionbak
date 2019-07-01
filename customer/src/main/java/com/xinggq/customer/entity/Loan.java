package com.xinggq.customer.entity;


import com.xinggq.annotation.CheckLoanType;
import com.xinggq.response.ICommonCode;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Loan {

  private String id;
  @CheckLoanType(message = ICommonCode.LOAN_TYPE_LEGAL)
  private String type;
  private long amount;
  @NotEmpty(message = ICommonCode.CUSTOMERID_ISNOT_EMPTY)
  private String customerId;


}
