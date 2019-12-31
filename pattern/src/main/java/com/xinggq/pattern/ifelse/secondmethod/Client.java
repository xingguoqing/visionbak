package com.xinggq.pattern.ifelse.secondmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:28
 * @description
 */
public class Client {


  /**
   * 这样写的好处就是运算符是被限定在枚举类中的，不会出现不合法运算符的情况
   * @param a 参数a
   * @param b 参数b
   * @return 计算结果
   */
  public static void calculate(int a, int b) {
    System.out.println(new Operation().calculate(1, 2, Operator.ADD));
    System.out.println(new Operation().calculate(1, 2, Operator.SUBTRACT));
  }

  public static void calculate(int a, int b,String operator) {
    System.out.println(new Operation().calculate(1, 2, Operator.valueOf(operator)));
  }


  public static void main(String[] args) {
    calculate(1,2);
    calculate(1,2,"divide");
  }
}
