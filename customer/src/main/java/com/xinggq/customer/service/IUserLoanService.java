package com.xinggq.customer.service;

import com.xinggq.customer.dto.UserLoanDto;
import com.xinggq.customer.entity.UserLoan;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:10
 * @description
 */
public interface IUserLoanService {

  List<UserLoan> queryByUserId(Long userid);

  void add(UserLoanDto userLoanDto);

  void deleteByloanid(Long loanid);
}
