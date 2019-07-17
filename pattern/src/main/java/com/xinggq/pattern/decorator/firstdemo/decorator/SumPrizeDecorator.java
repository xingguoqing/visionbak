package com.xinggq.pattern.decorator.firstdemo.decorator;

import com.xinggq.pattern.decorator.firstdemo.Component;

/**
 * @author xinggq
 * @date 2019-07-12 14:32
 * @description 计算累计奖金
 */
public class SumPrizeDecorator extends Decorator {

  /**
   * 通过构造方法传入被装饰的对象
   *
   * @param c 被装饰的对象
   */
  public SumPrizeDecorator(Component c) {
    super(c);
  }

  @Override
  public double calcPrize(String user) {
    //1：先获取前面运算出来的奖金
    double money = super.calcPrize(user);
    //2：然后计算累计奖金,其实应按人员去获取累计的业务额，然后再乘以0.1%
    //简单演示一下，假定大家的累计业务额都是1000000元
    double prize = 1000000 * 0.001;
    System.out.println(user+"累计奖金"+prize);
    return money + prize;
  }
}
