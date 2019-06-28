package com.xinggq.customer;

import com.xinggq.customer.controller.UserController;
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
  private UserController userController;

  @Test
  public void selecByPage(){
//    userController.selecByPage(1,2);
  }

}
