package com.xinggq.pattern.composite.seconddemo;

import java.util.List;

/**
 * @author xinggq
 * @date 2019-08-01 14:28
 * @description
 */
public abstract class Component {


  /**
   * 处理业务的方法
   */
  public void doSomething(){

  }

  /**
   * 添加节点
   * @param component
   */
  public abstract void add(Component component);

  /**
   * 移除节点
   * @param component
   */
  public abstract void remove(Component component);

  /**
   * 遍历子节点
   * @return
   */
  public abstract List<Component> getChildren();

}
