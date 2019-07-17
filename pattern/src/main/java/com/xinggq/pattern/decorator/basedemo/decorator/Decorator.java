package com.xinggq.pattern.decorator.basedemo.decorator;

import com.xinggq.pattern.decorator.basedemo.Component;

/**
 * @author xinggq
 * @date 2019-07-12 14:17
 * @description 抽象的装饰器对象 装饰器接口，维持一个指向组件对象的接口对象，并定义一个与组件接口一致的接口
 */
public class Decorator extends Component {


  /**
   * 持有组件对象
   */
  protected Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    //转发请求给组件对象，可以在转发前后执行一些附加动作
    component.operation();
  }

}
