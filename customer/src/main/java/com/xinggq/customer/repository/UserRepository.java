package com.xinggq.customer.repository;

import com.xinggq.customer.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author xinggq
 * @date 2019-07-01 11:31
 * @description
 */
@Mapper
@Repository
public interface UserRepository {

  User getById(String id);
}
