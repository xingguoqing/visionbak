package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.Loan;
import com.xinggq.customer.repository.LoanRepository;
import com.xinggq.customer.service.ILoanService;
import java.util.ArrayList;
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

  @Override
  public List<Loan> queryById(List<Long> loanIds) {
    if(CollectionUtils.isEmpty(loanIds)){
      return new ArrayList<>();
    }
    return loanRepository.queryById(loanIds);
  }

  @Override
  public void add(Loan loan) {
    loanRepository.add(loan);
  }
}
