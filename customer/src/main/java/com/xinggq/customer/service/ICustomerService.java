package com.xinggq.customer.service;


import com.xinggq.customer.entity.Customer;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:09
 * @description
 */
public interface ICustomerService extends IBaseService<Customer> {

  /**
   * 批量添加
   */
  void add(List<Customer> list);

  /**
   * 更新
   */
  void updateById(Customer entity);

  /**
   * 批量删除
   */
  void deleteByIds(List<String> ids);

}
