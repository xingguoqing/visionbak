//package com.xinggq.customer.service.impl;
//
//import com.xinggq.customer.common.LocalCach;
//import com.xinggq.customer.entity.Company;
//import com.xinggq.customer.entity.CustomerCompany;
//import com.xinggq.customer.repository.CompanyRepository;
//import com.xinggq.customer.repository.CustomerCompanyRepository;
//import com.xinggq.customer.service.ICompanyService;
//import com.xinggq.exception.BusiExceptionUtils;
//import com.xinggq.response.ICommonCode;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.StringUtils;
//
///**
// * @author xinggq
// * @date 2019-06-27 19:41
// * @description
// */
//@Service
//public class CompanyServiceImpl implements ICompanyService {
//
//  @Autowired
//  private CompanyRepository companyRepository;
//
//
//  @Override
//  public List<Company> queryById(List<String> ids) {
//    if(CollectionUtils.isEmpty(ids)){
//      return new ArrayList<>();
//    }
//    return companyRepository.querybyId(ids);
//  }
//
//  @Override
//  public void add(Company company) {
//     companyRepository.add(company);
//  }
//
//  @Override
//  public void updateById(Company company) {
//    checkAuth(company);
//    companyRepository.updateById(company);
//  }
//
//  private void checkAuth(Company company) {
//    if(StringUtils.isEmpty(company.getId())){
//      BusiExceptionUtils.wrapBusiException(ICommonCode.COMPANYID_ISNOT_EMPTY);
//    }
//    String userId = LocalCach.getUserId();
//    List<CustomerCompany> list = customerCompanyRepository.queryByCompanyId(company.getId());
//    if(!CollectionUtils.isEmpty(list) && list.size()>1){
//      BusiExceptionUtils.wrapBusiException(ICommonCode.COMPANY_UNABLE_CHANGE,"企业id为："+company.getId());
//    }
//    String customerId =list.get(0).getCustomerId();
//
//    if()
//    List<CustomerCompany> listTmp = list.stream().filter(e-> !e.getCustomerId().equals(userId)).collect(Collectors.toList());
//    if(!CollectionUtils.isEmpty(listTmp)){
//      BusiExceptionUtils.wrapBusiException(ICommonCode.AUTH_LEGAL);
//    }
//  }
//}
