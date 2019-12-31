package com.xinggq.pattern.ifelse.secondmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:23
 * @description 枚举类，在枚举类中实现具体的计算法方式
 */
public enum Operator {

  ADD {
    @Override
    public int calculator(int a, int b) {
      return a + b;
    }
  },
  SUBTRACT {
    @Override
    public int calculator(int a, int b) {
      return a - b;
    }
  };

  public abstract int calculator(int a, int b);

}
