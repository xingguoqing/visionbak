package com.xinggq.pattern.ifelse.thirdmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:34
 * @description 加法命令的实现类
 */
public class AddCommand implements Command {

  private int a;

  private int b;

  public AddCommand(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public Integer execute() {
    return a + b;
  }
}
