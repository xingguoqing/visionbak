package com.xinggq.pattern.decorator.basedemo.decorator;

import com.xinggq.pattern.decorator.basedemo.Component;

/**
 * @author xinggq
 * @date 2019-07-12 14:22
 * @description
 */
public class ConcreteDecoratorB extends Decorator {

  public ConcreteDecoratorB(Component component) {
    super(component);
  }

  /**
   * 需要添加的职责
   */
  private void addedBehavior() {
    //需要添加的职责实现
  }

  @Override
  public void operation() {
    //调用父类的方法，可以在调用前后执行一些附加动作
    super.operation();
    addedBehavior();
  }
}
