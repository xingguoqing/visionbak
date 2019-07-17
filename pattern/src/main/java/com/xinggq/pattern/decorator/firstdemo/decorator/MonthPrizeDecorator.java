package com.xinggq.pattern.decorator.firstdemo.decorator;

import com.xinggq.pattern.decorator.TempDB;
import com.xinggq.pattern.decorator.firstdemo.Component;

/**
 * @author xinggq
 * @date 2019-07-12 14:30
 * @description 具体的装饰对象 ，计算当月奖金
 */
public class MonthPrizeDecorator extends Decorator{

  /**
   * 通过构造方法传入被装饰的对象
   *
   * @param c 被装饰的对象
   */
  public MonthPrizeDecorator(Component c) {
    super(c);
  }

  /**
   * 在执行父类方法前后可以加入一些其他的操作
   * @param user
   * @return
   */
  @Override
  public double calcPrize(String user) {
    //1：先获取前面运算出来的奖金
    double money = super.calcPrize(user);
    //2：然后计算当月业务奖金,按人员和时间去获取当月业务额，然后再乘以3%
    double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
    System.out.println(user+"当月业务奖金"+prize);
    return money + prize;
  }

}
