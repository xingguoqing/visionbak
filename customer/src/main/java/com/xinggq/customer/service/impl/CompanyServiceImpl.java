package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.Company;
import com.xinggq.customer.repository.CompanyRepository;
import com.xinggq.customer.service.ICompanyService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author xinggq
 * @date 2019-06-27 19:41
 * @description
 */
@Service
public class CompanyServiceImpl implements ICompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  @Override
  public List<Company> queryById(List<Long> ids) {
    if(CollectionUtils.isEmpty(ids)){
      return new ArrayList<>();
    }
    return companyRepository.querybyId(ids);
  }

  @Override
  public void add(Company company) {
     companyRepository.add(company);
  }

  @Override
  public void updateById(Company company) {
    companyRepository.updateById(company);
  }
}
