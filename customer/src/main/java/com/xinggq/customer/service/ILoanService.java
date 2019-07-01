package com.xinggq.customer.service;

import com.xinggq.customer.entity.Loan;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:10
 * @description
 */
public interface ILoanService {

  List<Loan> queryById(List<String> loanIds);

  void add(Loan loan);
}
