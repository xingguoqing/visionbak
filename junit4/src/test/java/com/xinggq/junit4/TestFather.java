package com.xinggq.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author xinggq
 * @date 2019-07-15 17:06
 * @description
 */

public class TestFather {

  @BeforeClass
  public static void beforeClassFather() {
    System.out.println("我可是父类中的BeforeClass方法");
  }

  @Before
  public void beforeFather() {
    System.out.println("我可是父类中的before方法");
  }

  @Test
  public void testFather(){
    System.out.println("我可是父类中的Test方法");
  }


  @After
  public void test12(){
    System.out.println("我可是父类中的After方法");
  }

  @AfterClass
  public static void afterClassFather(){
    System.out.println("我可是父类中的AfterClass方法");
  }

}
