package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.Company;
import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.repository.CompanyRepository;
import com.xinggq.customer.service.ICompanyService;
import com.xinggq.customer.service.ICustomerService;
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
 * @date 2019-06-27 19:41
 * @description
 */
@Service
public class CompanyServiceImpl implements ICompanyService {

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private ICustomerService customerService;


  @Override
  public List<Company> queryById(List<String> ids) {
    if(CollectionUtils.isEmpty(ids)){
      return new ArrayList<>();
    }
    return companyRepository.querybyId(ids);
  }

  @Override
  public void add(Company company) {
    company.setId(UUIDUtils.getUUID());
    companyRepository.add(company);
  }

  @Override
  public void updateById(Company company) {
    check(company.getId());
    companyRepository.updateById(company);
  }

  @Override
  public List<Company> queryByCustomerId(String customerId) {
    return companyRepository.queryByCustomerId(customerId);
  }

  @Override
  public void deleteById(String id) {
    check(id);
    companyRepository.deleteById(id);
  }

  private void check(String companyId) {
    List<Company> companies = companyRepository.querybyId(Arrays.asList(companyId));
    if(CollectionUtils.isEmpty(companies)){
      BusiExceptionUtils.wrapBusiException(ICommonCode.COMPANY_NOT_EXIST);
    }
    String customerId = companies.get(0).getCustomerId();
    Customer customer = customerService.getById(customerId);
    if(customer == null){
      BusiExceptionUtils.wrapBusiException(ICommonCode.AUTH_LEGAL);
    }
  }
}
