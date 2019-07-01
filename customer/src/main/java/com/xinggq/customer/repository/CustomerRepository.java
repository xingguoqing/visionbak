package com.xinggq.customer.repository;

import com.xinggq.customer.entity.Customer;
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
public interface CustomerRepository {

  List<Customer> selecByPage(@Param("userId") String userId);

  void add(@Param("list") List<Customer> customers);

  void updateById(@Param("customer") Customer customer,@Param("userId") String userId);

  void deleteByIds(@Param("list")List<String> ids,@Param("userId")  String userId);

  List<Customer> getAuthCustomersByUserId(@Param("userId") String userId);

  Customer getById(@Param("id") String customerId,@Param("userId") String userId);
}
