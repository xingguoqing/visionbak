package com.xinggq.pattern.command.secondemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-12 10:53
 * @description
 */
public class Operation implements OperationApi {

  /**
   * 记录运算的结果
   */
  private int result;

  @Override
  public int getResult() {
    return result;
  }

  @Override
  public void setResult(int result) {
    this.result = result;
  }

  @Override
  public void add(int num) {
    //实现加法 功能
    result += num;
  }

  @Override
  public void substract(int num) {
    //实现减法 功能
    result -= num;
  }
}
