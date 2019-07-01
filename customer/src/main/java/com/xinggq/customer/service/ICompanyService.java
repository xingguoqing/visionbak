package com.xinggq.customer.service;

import com.xinggq.customer.entity.Company;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:09
 * @description
 */
public interface ICompanyService {

  List<Company> queryById(List<String> ids);


  void add(Company company);

  void updateById(Company company);
}
