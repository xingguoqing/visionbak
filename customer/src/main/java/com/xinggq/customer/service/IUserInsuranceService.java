package com.xinggq.customer.service;

import com.xinggq.customer.dto.UserInsuranceDto;
import com.xinggq.customer.entity.UserInsurance;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 19:49
 * @description
 */
public interface IUserInsuranceService {

  List<UserInsurance> queryByUserId(Long userid);

  void add(UserInsuranceDto userInsuranceDto);

  void deleteByInsuranceid(Long insuranceid);
}
