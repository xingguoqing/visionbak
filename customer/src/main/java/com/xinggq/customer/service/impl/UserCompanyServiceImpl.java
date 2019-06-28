package com.xinggq.customer.service.impl;

import com.xinggq.customer.dto.UserCompanyDto;
import com.xinggq.customer.entity.Company;
import com.xinggq.customer.entity.User;
import com.xinggq.customer.entity.UserCompany;
import com.xinggq.customer.repository.UserCompanyRepository;
import com.xinggq.customer.service.IUserCompanyService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.ICommonCode;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xinggq
 * @date 2019-06-27 20:05
 * @description
 */
@Service
public class UserCompanyServiceImpl implements IUserCompanyService {

  @Autowired
  private UserCompanyRepository userCompanyRepository;

  @Autowired
  private CompanyServiceImpl companyService;

  @Override
  public List<UserCompany> queryByUserId(Long userid) {
    return userCompanyRepository.queryByUserId(userid);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public void add(UserCompanyDto userCompanyDto) {
    User user = userCompanyDto.getUser();
    Company company = userCompanyDto.getCompany();
    checkUser(user);
    companyService.add(company);
    UserCompany userCompany = buildUserCompany(company,user);
    userCompanyRepository.add(userCompany);
  }

  @Override
  public void deleteByCompanyid(Long companyid) {
    userCompanyRepository.deleteByCompanyid(companyid);
  }

  private void checkUser(User user){
    if(user == null || user.getId() == null){
      BusiExceptionUtils.wrapBusiException(ICommonCode.USERID_ISNOT_EMPTY);
    }
  }

  private UserCompany buildUserCompany( Company company , User user){
    UserCompany userCompany = new UserCompany();
    userCompany.setCompanyId(company.getId());
    userCompany.setUserId(user.getId());
    return userCompany;
  }

}
