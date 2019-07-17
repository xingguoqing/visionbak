package com.xinggq.customer.privateapi;

import com.xinggq.customer.service.IUserService;
import com.xinggq.customerapi.api.UserClient;
import com.xinggq.customerapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author xinggq
 * @date 2019-07-09 10:30
 * @description
 */
@FeignClient
public class UserController implements UserClient {

  @Autowired
  private IUserService userService;

  @Override
  public User getuserByphone(String phone) {
    return userService.getByPhone(phone);
  }
}
