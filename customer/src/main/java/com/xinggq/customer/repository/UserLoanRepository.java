package com.xinggq.customer.repository;

import com.xinggq.customer.entity.UserLoan;
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
public interface UserLoanRepository {

  List<UserLoan> queryByUserId(@Param("userid") Long userid);

  void add(UserLoan userLoan);

  void deleteByloanid(@Param("loanid") Long loanid);
}
