package com.xinggq.customer.repository;

import com.xinggq.customer.entity.Loan;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author xinggq
 * @date 2019-06-25 16:38
 * @description
 */
@Mapper
@Repository
public interface LoanRepository {

  List<Loan> queryById(@Param("loanIds") List<String> loanIds);

  void add(Loan loan);
}
