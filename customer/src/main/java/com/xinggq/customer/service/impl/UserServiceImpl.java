package com.xinggq.customer.service.impl;

import com.xinggq.customer.entity.User;
import com.xinggq.customer.repository.UserRepository;
import com.xinggq.customer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xinggq
 * @date 2019-07-01 11:31
 * @description
 */
@Service
public class UserServiceImpl implements IUserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User getById(String id) {
    return userRepository.getById(id);
  }
}
