package com.xinggq.pattern.command.firstdemo.command;

import com.xinggq.pattern.command.firstdemo.reciver.MainBoardApi;

/**
 * @author xinggq
 * @date 2019-07-12 09:51
 * @description 开机命令的封装类
 *
 * 实现命令抽象接口，以具有执行命令的能力
 * 持有命令执行接口的引用，由命令执行接口完成命令执行
 */
public class OpenCommand implements Command {

  private MainBoardApi mainBoardApi;

  public OpenCommand(MainBoardApi mainBoardApi){
    this.mainBoardApi = mainBoardApi;
  }

  @Override
  public void execute() {
    mainBoardApi.open();
  }
}
