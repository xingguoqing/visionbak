package com.xinggq.customer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinggq.customer.entity.User;
import com.xinggq.customer.enums.UserTypeEnum;
import com.xinggq.customer.repository.UserRepository;
import com.xinggq.customer.service.IUserService;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xinggq
 * @date 2019-06-25 17:11
 * @description
 */
@Service
public class UserServiceImpl implements IUserService {

  @Autowired
  private UserRepository userRepository;


  @Override
  public PageInfo<User> selecByPage(Integer pageNum, Integer pageSize) {
    //starPage方法后必须紧接着就是查询的方法，不能有别的，否则就不起作用了
    PageHelper.startPage(pageNum, pageSize);
    List<User> users = userRepository.selecByPage(getOwersId());
    PageInfo<User> appsPageInfo = new PageInfo<>(users);
    return appsPageInfo;
  }

  @Override
  public void add(List<User> list) {
    initUser(list, UserTypeEnum.CUSTOMER, getOwersId().get(0));
    userRepository.add(list);
  }

  @Override
  public void updateById(User entity) {
    userRepository.updateById(entity, getOwersId().get(0));
  }

  @Override
  public void deleteByIds(List<Long> ids) {
    userRepository.deleteByIds(ids,getOwersId().get(0));
  }

  private void initUser(List<User> user, UserTypeEnum userType, long owner) {
    user.stream().forEach(e -> {
      e.setType(userType.getCode());
      e.setOwner(owner);
    });
  }


  public List<Long> getOwersId() {
    return Arrays.asList(123L);
  }


}
