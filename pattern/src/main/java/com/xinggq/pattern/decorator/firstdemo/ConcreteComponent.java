package com.xinggq.pattern.decorator.firstdemo;

/**
 * @author xinggq
 * @date 2019-07-12 14:28
 * @description 为计算奖金提供一个基本的实现
 */
public class ConcreteComponent extends Component {

  @Override
  public double calcPrize(String user) {
    //只是一个默认的实现，默认没有奖金
    return 0;
  }
}
