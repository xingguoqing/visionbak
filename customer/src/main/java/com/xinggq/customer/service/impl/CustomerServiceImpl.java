package com.xinggq.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinggq.customer.common.LocalCach;
import com.xinggq.customer.entity.Customer;
import com.xinggq.customer.repository.CustomerRepository;
import com.xinggq.customer.service.ICustomerService;
import com.xinggq.utils.UUIDUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xinggq
 * @date 2019-06-25 17:11
 * @description
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

  @Autowired
  private CustomerRepository customerRepository;


  @Override
  public PageInfo<Customer> selecByPage(Integer pageNum, Integer pageSize) {
    //starPage方法后必须紧接着就是查询的方法，不能有别的，否则就不起作用了
    PageHelper.startPage(pageNum, pageSize);
    List<Customer> customers = customerRepository.selecByPage(LocalCach.getUserId());
    PageInfo<Customer> appsPageInfo = new PageInfo<>(customers);
    return appsPageInfo;
  }

  @Override
  public void add(List<Customer> customers) {
    initCustomers(customers);
    customerRepository.add(customers);
  }

  @Override
  public void updateById(Customer customer) {
    customerRepository.updateById(customer, LocalCach.getUserId());
  }

  @Override
  public void deleteByIds(List<String> ids) {
    customerRepository.deleteByIds(ids,LocalCach.getUserId());
  }

  @Override
  public List<Customer> getAuthCustomers() {
    String userId = LocalCach.getUserId();
    return customerRepository.getAuthCustomersByUserId(userId);
  }

  @Override
  public Customer getById(String customerId) {
    return customerRepository.getById(customerId,LocalCach.getUserId());
  }

  private void initCustomers(List<Customer> customers) {
    customers.stream().forEach(e -> {
      e.setId(UUIDUtils.getUUID());
      e.setUserId(LocalCach.getUserId());
    });
  }

}
