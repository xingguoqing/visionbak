package com.xinggq.customer.controller;

import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.entity.Loan;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.customer.service.ILoanService;
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
 * @date 2019-06-28 14:57
 * @description
 */
@RestController
@RequestMapping("/loan")
public class UserLoanController {


  @Autowired
  private ILoanService loanService;

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
    List<Insurance> insurances = loanService.queryByCustomerId(customerId);
    return AbstractResponse.getSuccessResp(insurances);
  }

  @PostMapping("/add")
  public ICommonResponse addUserCompany(@Valid @RequestBody Loan loan) {
    checkCustomerId(loan.getCustomerId());
    loanService.add(loan);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/delete/id")
  public ICommonResponse deleteByid(@RequestParam String id) {
    loanService.deleteById(id);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/update/id")
  public ICommonResponse update(@Valid @RequestBody Loan loan) {
    loanService.updateById(loan);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

}
