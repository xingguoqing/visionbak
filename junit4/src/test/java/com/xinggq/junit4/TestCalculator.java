package com.xinggq.junit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author xinggq
 * @date 2019-07-15 10:20
 * @description
 *
 * 使用默认的runner，runner是标注在类上的，一个类指定类runner之后，类中的所有方法
 * 都使用同一个runner执行
 */
public class TestCalculator {

  private static Calculator calculator = new Calculator();

  /**
   * 比如我们上面的测试，由于只声明了一个Calculator对象，他的初始值是0，
   * 但是测试完加法操作后，他的值就不是0了；接下来测试减法操作，就必然要考虑上次加法操作的结果。
   * 这绝对是一个很糟糕的设计！我们非常希望每一个测试都是独立的，相互之间没有任何耦合度。
   * 因此，我们就很有必要在执行每一个测试之前，对Calculator对象进行一个“复原”操作，以消除其他测试造成的影响。
   * 因此，“在任何一个测试执行之前必须执行的代码”就是一个Fixture，我们用@Before来标注它。
   *
   * @Atfer同理
   */
  @Before
  public void before() {
    calculator.clear();
  }


  @Test
  public void add() {
    calculator.add(2);
    calculator.add(3);
    assertEquals(5, calculator.getResult());
  }

  @Test
  public void substract() {
    calculator.add(10);
    calculator.substract(2);
    assertEquals(1, calculator.getResult());
  }

  @Ignore("Multiply() Not yet implemented")
  @Test
  public void multiply() {
  }

  @Test
  public void divide() {
    calculator.add(8);
    calculator.divide(2);
    assertEquals(4, calculator.getResult());
  }

  @Test
  public void square() {
  }

  @Test(timeout = 2)
  public void squareRoot() {
    calculator.squareRoot(4);
    assertEquals(2, calculator.getResult());
  }

  @Test
  public void clear() {
  }

  @Test
  public void getResult() {
  }
}
