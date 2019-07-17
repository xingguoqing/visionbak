package com.xinggq.customerapi.api;

import com.xinggq.customerapi.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xinggq
 * @date 2019-07-09 10:18
 * @description
 */
@FeignClient
public interface UserClient {

  /**
   * 根据手机号查询用户
   * @param phone
   * @return
   */
  @RequestMapping(value = "/get0/{phone}", method = RequestMethod.GET)
  User getuserByphone(@PathVariable("phone") String phone);

}
