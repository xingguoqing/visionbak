package com.xinggq.customer.service;

import com.xinggq.customer.entity.Insurance;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:10
 * @description
 */
public interface IInsuranceService {

  List<Insurance> queryById(List<String> insuranceIds);

  List<Insurance> queryByCustomerId(String customerId);

  void add(Insurance insurance);

  void deleteById(String id);

  void updateById(Insurance insurance);
}
