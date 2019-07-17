package com.xinggq.pattern.decorator.firstdemo.decorator;

import com.xinggq.pattern.decorator.firstdemo.Component;

/**
 * @author xinggq
 * @date 2019-07-12 14:29
 * @description 定义抽象的装饰器
 */
public abstract class Decorator extends Component {

  /**
   * 持有被装饰的组件对象
   */
  protected Component c;
  /**
   * 通过构造方法传入被装饰的对象
   * @param c 被装饰的对象
   */
  public Decorator(Component c){
    this.c = c;
  }

  @Override
  public double calcPrize(String user) {
    //转调组件对象的方法
    return c.calcPrize(user);
  }
}
