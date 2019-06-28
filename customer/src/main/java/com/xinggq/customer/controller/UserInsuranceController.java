package com.xinggq.customer.controller;

import com.xinggq.customer.dto.UserInsuranceDto;
import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.entity.UserInsurance;
import com.xinggq.customer.service.IInsuranceService;
import com.xinggq.customer.service.IUserInsuranceService;
import com.xinggq.response.AbstractResponse;
import com.xinggq.response.ICommonResponse;
import com.xinggq.response.ResponseCode;
import java.util.List;
import java.util.stream.Collectors;
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
@RequestMapping("/user_insurance")
public class UserInsuranceController {

  @Autowired
  private IUserInsuranceService userInsuranceService;

  @Autowired
  private IInsuranceService iInsuranceService;

  @GetMapping("/query_by_userid")
  public ICommonResponse queryByUserId(@RequestParam Long userid) {

    List<UserInsurance> userInsurances = userInsuranceService.queryByUserId(userid);
    List<Long> insuranceIds = userInsurances.stream().map(UserInsurance::getInsuranceId).collect(
        Collectors.toList());
    List<Insurance> longs = iInsuranceService.queryById(insuranceIds);
    return AbstractResponse.getSuccessResp(longs);
  }


  @PostMapping("/add_user_insurance")
  public ICommonResponse addUserInsurance(@RequestBody UserInsuranceDto userInsuranceDto) {

    userInsuranceService.add(userInsuranceDto);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/delete_by_insurance")
  public ICommonResponse deleteByInsuranceid(@RequestParam Long insuranceid) {
    userInsuranceService.deleteByInsuranceid(insuranceid);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

}
