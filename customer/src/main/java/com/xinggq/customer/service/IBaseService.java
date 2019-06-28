package com.xinggq.customer.service;

import com.github.pagehelper.PageInfo;

/**
 * 基本的接口，查询（查询使用的PageHelper）
 * @author xinggq
 * @date 2019-06-26 10:02
 * @description
 */
public interface IBaseService<T> {


  /**
   * 分页查询
   * @param pageNum
   * @param pageSize
   * @return
   */
  PageInfo<T> selecByPage(Integer pageNum,Integer pageSize);

}
