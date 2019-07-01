package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.Company;
import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.repository.InsuranceRepository;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.customer.service.IInsuranceService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.ICommonCode;
import com.xinggq.utils.UUIDUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author xinggq
 * @date 2019-06-28 15:45
 * @description
 */
@Service
public class InsuranceServiceImpl implements IInsuranceService {

  @Autowired
  private InsuranceRepository insuranceRepository;


  @Autowired
  private ICustomerService customerService;

  @Override
  public List<Insurance> queryById(List<String> insuranceIds) {
    if(CollectionUtils.isEmpty(insuranceIds)){
      return new ArrayList<>();
    }
    return insuranceRepository.queryById(insuranceIds);
  }

  @Override
  public List<Insurance> queryByCustomerId(String customerId) {
    return insuranceRepository.queryByCustomerId(customerId);
  }

  @Override
  public void add(Insurance insurance) {
    insurance.setId(UUIDUtils.getUUID());
    insuranceRepository.add(insurance);
  }

  @Override
  public void deleteById(String id) {
    check(id);
    insuranceRepository.deleteById(id);
  }

  @Override
  public void updateById(Insurance insurance) {
    check(insurance.getId());
    insuranceRepository.updateById(insurance);
  }


  private void check(String id) {
    List<Insurance> insurances = insuranceRepository.queryById(Arrays.asList(id));
    if(CollectionUtils.isEmpty(insurances)){
      BusiExceptionUtils.wrapBusiException(ICommonCode.INSURANCE_NOT_EXIST);
    }
    String customerId = insurances.get(0).getCustomerId();
    Customer customer = customerService.getById(customerId);
    if(customer == null){
      BusiExceptionUtils.wrapBusiException(ICommonCode.AUTH_LEGAL);
    }
  }
}
