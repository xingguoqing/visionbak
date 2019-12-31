package com.xinggq.pattern.ifelse;

/**
 * @author xinggq
 * @date 2019-08-13 22:02
 * @description 这个是目标代码，要去优化这个类里的代码
 */
public class Demo {

  /**
   * 根据操作符计算两个参数的运算结果 这里只写了加法和减法操作，乘除和取余都没有写
   *
   * @param a 参数a
   * @param b 参数b
   * @param operator 运算符
   * @return 计算结果
   */
  public int calculate(int a, int b, String operator) {

    int result = Integer.MIN_VALUE;
    if ("add".equals(operator)) {
      return a + b;
    } else if ("subtract".equals(operator)) {
      return a - b;
    }
    return result;
  }

}
