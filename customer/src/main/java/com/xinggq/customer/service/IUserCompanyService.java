package com.xinggq.customer.service;

import com.xinggq.customer.dto.UserCompanyDto;
import com.xinggq.customer.entity.UserCompany;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-06-25 17:10
 * @description
 */
public interface IUserCompanyService {

  List<UserCompany> queryByUserId(Long userid);

  void add(UserCompanyDto userCompanyDto);

  void deleteByCompanyid(Long companyid);
}
