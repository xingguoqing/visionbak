package com.xinggq.pattern.command.thirdemo.command;

import com.xinggq.pattern.command.thirdemo.reciver.CookApi;

/**
 * @author xinggq
 * @date 2019-07-12 11:18
 * @description
 */
public class ChopCommand implements Command {

  /**
   * 持有具体做菜的厨师的对象
   */
  private CookApi cookApi = null;
  /**
   * 设置具体做菜的厨师的对象
   * @param cookApi 具体做菜的厨师的对象
   */
  public void setCookApi(CookApi cookApi) {
    this.cookApi = cookApi;
  }

  @Override
  public void execute() {
    this.cookApi.cook("绿豆排骨煲");
  }
}
