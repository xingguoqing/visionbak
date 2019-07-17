package com.xinggq.customer.service;


import com.xinggq.customerapi.entity.User;

/**
 * @author xinggq
 * @date 2019-07-01 11:29
 * @description
 */
public interface IUserService {

  User getById(String id);

  User getByPhone(String phone);

}
