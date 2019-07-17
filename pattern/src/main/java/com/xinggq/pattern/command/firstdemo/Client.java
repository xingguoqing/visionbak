package com.xinggq.pattern.command.firstdemo;

import com.xinggq.pattern.command.firstdemo.command.Command;
import com.xinggq.pattern.command.firstdemo.command.OpenCommand;
import com.xinggq.pattern.command.firstdemo.reciver.AigoMainBoard;
import com.xinggq.pattern.command.firstdemo.reciver.GigaMainBoard;
import com.xinggq.pattern.command.firstdemo.reciver.MainBoardApi;

/**
 * @author xinggq
 * @date 2019-07-12 09:56
 * @description
 */
public class Client {

  public static void main(String[] args) {
    MainBoardApi mainBoardApi = new AigoMainBoard();
    Command command = new OpenCommand(mainBoardApi);
    Box box = new Box();
    box.setCommand(command);
    box.openButtonPressed();

    mainBoardApi = new GigaMainBoard();
    command = new OpenCommand(mainBoardApi);
    box.setCommand(command);
    box.openButtonPressed();
  }

}
