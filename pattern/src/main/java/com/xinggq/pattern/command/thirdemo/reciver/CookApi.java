package com.xinggq.pattern.command.thirdemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-12 11:14
 * @description 厨师api
 */
public interface CookApi {

  /**
   * 做菜的方法
   * @param name 菜名
   */
  public void cook(String name);
}
