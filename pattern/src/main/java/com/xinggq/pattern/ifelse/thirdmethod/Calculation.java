package com.xinggq.pattern.ifelse.thirdmethod;

/**
 * @author xinggq
 * @date 2019-08-13 22:37
 * @description 对命令进行包装
 */
public class Calculation {

  public int calcute(Command command){
    return command.execute();
  }

}
