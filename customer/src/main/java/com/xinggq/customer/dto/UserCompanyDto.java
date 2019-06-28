package com.xinggq.customer.dto;

import com.xinggq.customer.entity.Company;
import com.xinggq.customer.entity.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xinggq
 * @date 2019-06-27 20:38
 * @description
 */
@Setter
@Getter
public class UserCompanyDto {

  private User user;
  private Company company;

}
