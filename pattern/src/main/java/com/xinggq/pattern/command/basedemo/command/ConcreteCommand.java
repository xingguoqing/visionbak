package com.xinggq.pattern.command.basedemo.command;

import com.xinggq.pattern.command.basedemo.reciver.Receiver;

/**
 * @author xinggq
 * @date 2019-07-11 15:29
 * @description
 */
public class ConcreteCommand extends Command {

  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action();
  }
}
