package com.xinggq.customer.repository;

import com.xinggq.customer.entity.UserInsurance;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author xinggq
 * @date 2019-06-25 19:48
 * @description
 */
@Mapper
@Repository
public interface UserInsuranceRepository {

  List<UserInsurance> queryByUserId(@Param("userId") Long userid);

  void add(UserInsurance userInsurance);

  void deleteByInsranceId(@Param("insuranceid") Long insuranceid);
}
