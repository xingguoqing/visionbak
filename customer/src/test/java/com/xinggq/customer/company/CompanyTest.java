package com.xinggq.customer.company;

import com.xinggq.customer.CustomerApplication;
import com.xinggq.customer.controller.CompanyController;
import com.xinggq.customer.entity.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xinggq
 * @date 2019-07-01 10:56
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CustomerApplication.class)
public class CompanyTest {


  @Autowired
  private CompanyController companyController;

  @Test
  public void update(){
    Company company = new Company();
    company.setId("2");
    company.setAddress("测试地址");
    company.setName("测试公司名称");
//    companyController.update(company);
  }

}
