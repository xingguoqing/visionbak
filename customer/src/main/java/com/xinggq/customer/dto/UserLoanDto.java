package com.xinggq.customer.dto;


import com.xinggq.customer.entity.Loan;
import com.xinggq.customer.entity.Customer;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xinggq
 * @date 2019-06-28 15:14
 * @description
 */
@Setter
@Getter
public class UserLoanDto {

  private Customer user;
  private Loan loan;

}
