package com.xinggq.customer.service.impl;

import com.xinggq.customer.dto.UserLoanDto;
import com.xinggq.customer.entity.Loan;
import com.xinggq.customer.entity.User;
import com.xinggq.customer.entity.UserLoan;
import com.xinggq.customer.repository.UserLoanRepository;
import com.xinggq.customer.service.ILoanService;
import com.xinggq.customer.service.IUserLoanService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.ICommonCode;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xinggq
 * @date 2019-06-28 15:06
 * @description
 */
@Service
public class UserLoanServiceImpl implements IUserLoanService {

  @Autowired
  private UserLoanRepository userLoanRepository;

  @Autowired
  private ILoanService loanService;

  @Override
  public List<UserLoan> queryByUserId(Long userid) {
    return userLoanRepository.queryByUserId(userid);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public void add(UserLoanDto userLoanDto) {
    User user = userLoanDto.getUser();
    Loan loan = userLoanDto.getLoan();
    checkUser(user);
    loanService.add(loan);
    UserLoan userLoan = buildUserLoan(loan,user);
    userLoanRepository.add(userLoan);
  }

  @Override
  public void deleteByloanid(Long loanid) {
    userLoanRepository.deleteByloanid(loanid);
  }

  private void checkUser(User user){
    if(user == null || user.getId() == null){
      BusiExceptionUtils.wrapBusiException(ICommonCode.USERID_ISNOT_EMPTY);
    }
  }

  private UserLoan buildUserLoan( Loan loan , User user){
    UserLoan userLoan = new UserLoan();
    userLoan.setLoanId(loan.getId());
    userLoan.setUserId(user.getId());
    return userLoan;
  }


}
