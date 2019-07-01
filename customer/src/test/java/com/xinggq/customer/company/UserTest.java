package com.xinggq.customer.company;

import com.xinggq.customer.CustomerApplication;
import com.xinggq.customer.controller.CustomerController;
import com.xinggq.customer.dto.PageQueryDto;
import com.xinggq.customer.entity.Customer;
import com.xinggq.response.ICommonResponse;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xinggq
 * @date 2019-06-25 18:58
 * @description
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CustomerApplication.class)
public class UserTest {


  @Autowired
  private CustomerController customerController;

  @Test
  public void selecByPage(){
    PageQueryDto pageQueryDto = new PageQueryDto();
    pageQueryDto.setPageNum(1);
    pageQueryDto.setPageSize(2);
    ICommonResponse commonResponse = customerController.selecByPage(pageQueryDto);
    System.out.println();
  }

  @Test
  public void add(){
    Customer customer = new Customer();
    customer.setName("测试");
    customer.setPhone("123");
    customer.setAge("1");
    customer.setSex("2");
    ICommonResponse commonResponse = customerController.add(customer);
    System.out.println();
  }


  @Test
  public void updateById(){
    Customer customer = new Customer();
    customer.setName("测试");
    customer.setPhone("123");
    customer.setAge("1");
    customer.setSex("2");
    ICommonResponse commonResponse = customerController.updateById(customer);
    System.out.println();
  }

  @Test
  public void delete(){
    ICommonResponse commonResponse = customerController.delete(Arrays.asList("1"));
    System.out.println();
  }

}
