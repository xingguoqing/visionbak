package com.xinggq.customer.company;

import com.xinggq.customer.CustomerApplication;
import com.xinggq.customer.controller.CompanyController;
import com.xinggq.customer.entity.Company;
import com.xinggq.response.ICommonResponse;
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
  public void query(){
    ICommonResponse commonResponse = companyController.queryByCustomerId("5");
    System.out.println();
  }

  @Test
  public void add(){
    Company company = new Company();
    company.setName("测试");
    company.setAddress("测试地址");
    company.setCustomerId("5");
    ICommonResponse commonResponse = companyController.addUserCompany(company);
    System.out.println();
  }

  @Test
  public void delete(){
    ICommonResponse commonResponse = companyController.deleteByCompanyid("2");
    System.out.println();
  }

  @Test
  public void update(){
    Company company = new Company();
    company.setName("测试");
    company.setAddress("测试地址");
    company.setCustomerId("2");
    company.setId("3");
    ICommonResponse commonResponse = companyController.update(company);
    System.out.println();
  }

}
