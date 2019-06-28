package com.xinggq.customer.repository;

import com.xinggq.customer.entity.User;
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
public interface UserRepository {

  List<User> selecByPage(@Param("list") List<Long> owner);

  void add(@Param("list") List<User> users);

  void updateById(@Param("entity")User entity,@Param("owner") Long owner);

  void deleteByIds(@Param("list")List<Long> ids,@Param("owner")  Long aLong);
}
