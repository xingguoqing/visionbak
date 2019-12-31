package com.xinggq.pattern.ifelse.firstmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:09
 * @description 减法操作的具体实现
 */
public class SubtractOperation implements Operation {

  @Override
  public int calculate(int a, int b) {
    return a - b;
  }
}
