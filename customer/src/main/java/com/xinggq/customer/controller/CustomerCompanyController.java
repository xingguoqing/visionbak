//package com.xinggq.customer.controller;
//
//import com.xinggq.customer.dto.UserCompanyDto;
//import com.xinggq.customer.entity.Company;
//import com.xinggq.customer.entity.Customer;
//import com.xinggq.customer.service.ICompanyService;
//import com.xinggq.customer.service.ICustomerService;
//import com.xinggq.customer.service.IUserService;
//import com.xinggq.response.AbstractResponse;
//import com.xinggq.response.ICommonResponse;
//import com.xinggq.response.ResponseCode;
//import java.util.List;
//import java.util.stream.Collectors;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author xinggq
// * @date 2019-06-28 11:18
// * @description
// */
//@RestController
//@RequestMapping("/company")
//public class CustomerCompanyController {
//
//  @Autowired
//  private ICompanyService companyService;
//
//  @Autowired
//  private ICustomerService customerService;
//
//  private List<Customer> getAuthCustomers(){
//    customerService.getAuthCustomers();
//  }
//
//
//  @GetMapping("/query/customerid")
//  public ICommonResponse selecByPage(@RequestParam String customerId) {
//
//    List<Company> companies = companyService.queryByCsutomerId(customerId);
//
//    List<UserCompany> userCompanies = userCompanyService.queryByUserId(userid);
//    List<String> companyIds = userCompanies.stream().map(UserCompany::getCompanyId).collect(
//        Collectors.toList());
//    List<Company> companies =companyService.queryById(companyIds);
//    return AbstractResponse.getSuccessResp(companies);
//  }
//
//  @PostMapping("/add_user_company")
//  public ICommonResponse addUserCompany(@RequestBody UserCompanyDto userCompanyDto) {
//
//    userCompanyService.add(userCompanyDto);
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }
//
//
//  @PostMapping("/delete_by_id")
//  public ICommonResponse deleteByCompanyid(@RequestParam String id) {
//    userCompanyService.deleteById(id);
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }
//
//
//
//
//  @PostMapping("/update")
//  public ICommonResponse update(@Valid @RequestBody Company company) {
//    companyService.updateById(company);
//    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
//  }
//
//
//
//}
