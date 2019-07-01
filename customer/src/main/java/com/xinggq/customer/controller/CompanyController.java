package com.xinggq.customer.controller;

import com.xinggq.customer.entity.Company;
import com.xinggq.customer.service.ICompanyService;
import com.xinggq.customer.service.IUserService;
import com.xinggq.response.AbstractResponse;
import com.xinggq.response.ICommonResponse;
import com.xinggq.response.ResponseCode;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinggq
 * @date 2019-06-28 11:18
 * @description
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

//  @Autowired
//  private ICompanyService companyService;
//
//  @PostMapping("/update")
//  public ICommonResponse update(@Valid @RequestBody Company company) {
//    companyService.updateById(company);
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }

}
