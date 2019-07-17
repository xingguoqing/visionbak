package com.xinggq.pattern.command.secondemo.command;

/**
 * @author xinggq
 * @date 2019-07-12 10:54
 * @description 命令接口，声明执行的操作，支持可撤销操作
 */
public interface Command {

  /**
   * 执行命令对应的操作
   */
  void execute();

  /**
   * 执行撤销命令对应的操作
   */
  void undo();

}
