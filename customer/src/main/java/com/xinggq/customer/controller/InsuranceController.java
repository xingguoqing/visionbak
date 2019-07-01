package com.xinggq.customer.controller;

import com.xinggq.customer.dto.UserInsuranceDto;
import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.customer.service.IInsuranceService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.AbstractResponse;
import com.xinggq.response.ICommonCode;
import com.xinggq.response.ICommonResponse;
import com.xinggq.response.ResponseCode;
import java.util.List;
import java.util.stream.Collectors;
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
 * @date 2019-06-28 15:31
 * @description
 */
@RestController
@RequestMapping("/insurance")
public class InsuranceController {

  @Autowired
  private IInsuranceService insuranceService;

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
    List<Insurance> insurances = insuranceService.queryByCustomerId(customerId);
    return AbstractResponse.getSuccessResp(insurances);
  }

  @PostMapping("/add")
  public ICommonResponse addUserCompany(@Valid @RequestBody Insurance insurance) {
    checkCustomerId(insurance.getCustomerId());
    insuranceService.add(insurance);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/delete/id")
  public ICommonResponse deleteByid(@RequestParam String id) {
    insuranceService.deleteById(id);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/update/id")
  public ICommonResponse update(@Valid @RequestBody Insurance insurance) {
    insuranceService.updateById(insurance);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

}
