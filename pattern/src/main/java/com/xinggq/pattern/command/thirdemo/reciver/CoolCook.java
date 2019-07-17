package com.xinggq.pattern.command.thirdemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-12 11:16
 * @description 做凉菜的厨师
 */
public class CoolCook implements CookApi {

  @Override
  public void cook(String name) {
    System.out.println("凉菜"+name+"已经做好，本厨师正在装盘。" );
  }
}
