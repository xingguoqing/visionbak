package com.xinggq.pattern.decorator.firstdemo;

/**
 * @author xinggq
 * @date 2019-07-12 14:27
 * @description 计算奖金的组件
 */
public abstract class Component {

  /**
   * 计算某人的奖金
   * @param user 被计算奖金的人员
   * @return 某人在某段时间内的奖金
   */
  public abstract double calcPrize(String user);
}
