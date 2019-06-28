package com.xinggq.customer.controller;

import com.xinggq.customer.dto.UserLoanDto;
import com.xinggq.customer.entity.Loan;
import com.xinggq.customer.entity.UserLoan;
import com.xinggq.customer.service.ILoanService;
import com.xinggq.customer.service.IUserLoanService;
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
 * @date 2019-06-28 14:57
 * @description
 */
@RestController
@RequestMapping("/user_loan")
public class UserLoanController {


  @Autowired
  private IUserLoanService userLoanService;

  @Autowired
  private ILoanService loanService;

  @GetMapping("/query_by_userid")
  public ICommonResponse queryByUserId(@RequestParam Long userid) {

    List<UserLoan> userLoans = userLoanService.queryByUserId(userid);
    List<Long> loanIds = userLoans.stream().map(UserLoan::getLoanId).collect(
        Collectors.toList());
    List<Loan> longs = loanService.queryById(loanIds);
    return AbstractResponse.getSuccessResp(longs);
  }

  @PostMapping("/add_user_loan")
  public ICommonResponse addUserLoan(@RequestBody UserLoanDto userLoanDto) {

    userLoanService.add(userLoanDto);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }


  @PostMapping("/delete_by_loan")
  public ICommonResponse deleteByloanid(@RequestParam Long loanid) {
    userLoanService.deleteByloanid(loanid);
    return AbstractResponse.getSuccessResp(ResponseCode.SUCCESS);
  }

}
