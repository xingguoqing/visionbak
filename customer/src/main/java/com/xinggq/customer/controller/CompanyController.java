package com.xinggq.customer.controller;

import com.xinggq.customer.entity.Company;
import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.service.ICompanyService;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.AbstractResponse;
import com.xinggq.response.ICommonCode;
import com.xinggq.response.ICommonResponse;
import com.xinggq.response.ResponseCode;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinggq
 * @date 2019-06-28 11:18
 * @description
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

  @Autowired
  private ICompanyService companyService;

  @Autowired
  private ICustomerService customerService;


  private void checkCustomerId(String customerId) {

    Customer customer = customerService.getById(customerId);
    if (customer == null) {
      BusiExceptionUtils.wrapBusiException(ICommonCode.CUSTOMERID_NOT_EXIST);
    }
  }

  @GetMapping("/query/customerid")
  public ICommonResponse queryByCustomerId(@RequestParam String customerId) {

    checkCustomerId(customerId);
    List<Company> companies = companyService.queryByCustomerId(customerId);
    return AbstractResponse.getSuccessResp(companies);
  }

  @PostMapping("/add")
  public ICommonResponse addUserCompany(@Valid @RequestBody Company company) {
    checkCustomerId(company.getCustomerId());
    companyService.add(company);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/delete/id")
  public ICommonResponse deleteByCompanyid(@RequestParam String id) {
    companyService.deleteById(id);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/update/id")
  public ICommonResponse update(@Valid @RequestBody Company company) {
    companyService.updateById(company);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


}
