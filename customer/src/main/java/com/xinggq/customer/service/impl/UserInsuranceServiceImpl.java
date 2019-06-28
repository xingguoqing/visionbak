package com.xinggq.customer.service.impl;

import com.xinggq.customer.dto.UserInsuranceDto;
import com.xinggq.customer.entity.Company;
import com.xinggq.customer.entity.Insurance;
import com.xinggq.customer.entity.User;
import com.xinggq.customer.entity.UserCompany;
import com.xinggq.customer.entity.UserInsurance;
import com.xinggq.customer.repository.InsuranceRepository;
import com.xinggq.customer.repository.UserInsuranceRepository;
import com.xinggq.customer.service.IUserInsuranceService;
import com.xinggq.exception.BusiExceptionUtils;
import com.xinggq.response.ICommonCode;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xinggq
 * @date 2019-06-28 15:40
 * @description
 */
@Service
public class UserInsuranceServiceImpl implements IUserInsuranceService {

  @Autowired
  private InsuranceRepository insuranceRepository;

  @Autowired
  private UserInsuranceRepository userInsuranceRepository;

  @Override
  public List<UserInsurance> queryByUserId(Long userid) {
    return userInsuranceRepository.queryByUserId(userid);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public void add(UserInsuranceDto userInsuranceDto) {
    User user = userInsuranceDto.getUser();
    Insurance insurance = userInsuranceDto.getInsurance();
    checkUser(user);
    insuranceRepository.add(insurance);
    UserInsurance userCompany = buildUserCompany(insurance,user);
    userInsuranceRepository.add(userCompany);
  }

  @Override
  public void deleteByInsuranceid(Long insuranceid) {
    userInsuranceRepository.deleteByInsranceId(insuranceid);
  }

  private void checkUser(User user){
    if(user == null || user.getId() == null){
      BusiExceptionUtils.wrapBusiException(ICommonCode.USERID_ISNOT_EMPTY);
    }
  }

  private UserInsurance buildUserCompany( Insurance insurance , User user){
    UserInsurance userInsurance = new UserInsurance();
    userInsurance.setInsuranceId(insurance.getId());
    userInsurance.setUserId(user.getId());
    return userInsurance;
  }
}
