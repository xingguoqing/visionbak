package com.xinggq.pattern.command.basedemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-11 15:33
 * @description
 */
public class ReceiverA extends Receiver {

  @Override
  public void action() {
    System.out.println("第一个命令接收者执行命令");
  }
}
