package com.xinggq.customer.dto;

import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.entity.Customer;
import lombok.Getter;
import lombok.Setter;
/**
 * @author xinggq
 * @date 2019-06-28 15:56
 * @description
 */
@Setter
@Getter
public class UserInsuranceDto {

  private Customer user;
  private Insurance insurance;
}
