package com.xinggq.junit4;

/**
 * @author xinggq
 * @date 2019-07-15 10:13
 * @description
 */
public class Calculator {

  /**
   * 静态变量，用于存储运行结果
   */
  private static int result;

  public void add(int n) {
    result = result + n;
  }

  public void substract(int n) {
    /**
     * Bug: 正确的应该是 result =result-n
     */
    result = result - 1;
  }

  /**
   * 此方法尚未写好
   * @param n
   */
  public void multiply(int n) {
  }

  public void divide(int n) {
    result = result / n;
  }

  public void square(int n) {
    result = n * n;
  }

  /**
   * Bug : 死循环
   * @param n
   */
  public void squareRoot(int n) {
    for (; ; ) {
      ;
    }
  }

  /**
   * 将结果清零
   */
  public void clear() {
    result = 0;
  }

  public int getResult() {
    return result;
  }

}
