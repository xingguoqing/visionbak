package com.xinggq.pattern.command.thirdemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-12 11:15
 * @description 做热菜的厨师
 */
public class HotCook implements CookApi {

  @Override
  public void cook(String name) {
    System.out.println("本厨师正在做热菜："+name);
  }
}
