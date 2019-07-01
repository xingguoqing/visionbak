package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.entity.Loan;
import com.xinggq.customer.repository.LoanRepository;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.customer.service.ILoanService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.ICommonCode;
import com.xinggq.utils.UUIDUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author xinggq
 * @date 2019-06-28 15:09
 * @description
 */
@Service
public class LoanServiceImpl implements ILoanService {


  @Autowired
  private LoanRepository loanRepository;

  @Autowired
  private ICustomerService customerService;

  @Override
  public List<Loan> queryById(List<String> loanIds) {
    if(CollectionUtils.isEmpty(loanIds)){
      return new ArrayList<>();
    }
    return loanRepository.queryById(loanIds);
  }

  @Override
  public void add(Loan loan) {
    loan.setId(UUIDUtils.getUUID());
    loanRepository.add(loan);
  }

  @Override
  public List<Insurance> queryByCustomerId(String customerId) {
    return loanRepository.queryByCustomerId(customerId);
  }

  @Override
  public void deleteById(String id) {
    check(id);
    loanRepository.deleteById(id);
  }

  @Override
  public void updateById(Loan loan) {
    check(loan.getId());
    loanRepository.updateById(loan);
  }

  private void check(String id) {
    List<Loan> loans = loanRepository.queryById(Arrays.asList(id));
    if(CollectionUtils.isEmpty(loans)){
      BusiExceptionUtils.wrapBusiException(ICommonCode.LOAN_NOT_EXIST);
    }
    String customerId = loans.get(0).getCustomerId();
    Customer customer = customerService.getById(customerId);
    if(customer == null){
      BusiExceptionUtils.wrapBusiException(ICommonCode.AUTH_LEGAL);
    }
  }
}
