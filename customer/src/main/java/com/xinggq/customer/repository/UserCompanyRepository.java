package com.xinggq.customer.repository;

import com.xinggq.customer.entity.UserCompany;
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
public interface UserCompanyRepository {

  List<UserCompany> queryByUserId(@Param("userId") Long userId);

  void add(UserCompany userCompany);

  void deleteByCompanyid(@Param("companyid") Long companyid);
}
