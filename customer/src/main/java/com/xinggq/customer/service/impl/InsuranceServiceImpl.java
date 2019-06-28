package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.repository.InsuranceRepository;
import com.xinggq.customer.service.IInsuranceService;
import java.util.ArrayList;
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

  @Override
  public List<Insurance> queryById(List<Long> insuranceIds) {
    if(CollectionUtils.isEmpty(insuranceIds)){
      return new ArrayList<>();
    }
    return insuranceRepository.queryById(insuranceIds);
  }
}
