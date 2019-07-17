package com.xinggq.pattern.command.firstdemo;

import com.xinggq.pattern.command.firstdemo.command.Command;

/**
 * @author xinggq
 * @date 2019-07-12 09:53
 * @description 主机箱
 */
public class Box {

  private Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void openButtonPressed(){
    command.execute();
  }

}
