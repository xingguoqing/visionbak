package com.xinggq.pattern.command.basedemo;

import com.xinggq.pattern.command.basedemo.command.Command;
import com.xinggq.pattern.command.basedemo.command.ConcreteCommand;
import com.xinggq.pattern.command.basedemo.reciver.Receiver;
import com.xinggq.pattern.command.basedemo.reciver.ReceiverA;
import com.xinggq.pattern.command.basedemo.reciver.ReceiverB;

/**
 * @author xinggq
 * @date 2019-07-11 15:34
 * @description 组装类
 */
public class Client {

  public static void main(String[] args) {
    Receiver receiverA = new ReceiverA();
    Command command = new ConcreteCommand(receiverA);
    Invoker invoker = new Invoker();
    invoker.setCommand(command);
//    invoker.call();


    Receiver receiverB = new ReceiverB();
    command = new ConcreteCommand(receiverB);
    invoker.setCommand(command);
//    invoker.call();

  }

}
