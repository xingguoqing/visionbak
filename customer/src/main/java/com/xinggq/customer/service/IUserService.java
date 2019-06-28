package com.xinggq.customer.service;


import com.xinggq.customer.entity.User;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:09
 * @description
 */
public interface IUserService extends IBaseService<User> {

  /**
   * 批量添加
   */
  void add(List<User> list);

  /**
   * 更新
   */
  void updateById(User entity);

  /**
   * 批量删除
   */
  void deleteByIds(List<Long> ids);

}
