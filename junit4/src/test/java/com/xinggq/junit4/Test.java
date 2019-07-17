package com.xinggq.junit4;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author xinggq
 * @date 2019-07-15 09:53
 * @description
 */
public class Test extends TestFather {

  @BeforeClass
  public static void beforeClass() {
    System.out.println("@BeforeClass");
  }

  @Before
  public void before1() {
    System.out.println("@Before1");
  }

  @org.junit.Test
  public void test1() {
    System.out.println("@Test1");
  }

  @After
  public void after() {
    System.out.println("@After");
  }

  @AfterClass
  public static void afterClass() {
    System.out.println("@AfterClass");
  }

}
