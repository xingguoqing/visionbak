package com.xinggq.pattern.command.basedemo;

import com.xinggq.pattern.command.basedemo.command.Command;

/**
 * @author xinggq
 * @date 2019-07-11 14:17
 * @description
 */
public class Invoker{


  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void call(){
    command.execute();
  }
}


