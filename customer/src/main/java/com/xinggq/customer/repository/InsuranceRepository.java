package com.xinggq.customer.repository;

import com.xinggq.customer.entity.Insurance;
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
public interface InsuranceRepository {

  List<Insurance> queryById(@Param("insuranceIds") List<String> insuranceIds);

  void add(Insurance insurance);

  List<Insurance> queryByCustomerId(@Param("customerId")String customerId);

  void deleteById(@Param("id") String id);

  void updateById(Insurance insurance);
}
