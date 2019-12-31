package com.xinggq.pattern.ifelse.secondmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:27
 * @description 封装operator枚举类
 */
public class Operation {

  public int calculate(int a, int b, Operator operator) {
    return operator.calculator(a, b);
  }

}
