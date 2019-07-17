package com.xinggq.pattern.command.thirdemo.command;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author xinggq
 * @date 2019-07-12 11:24
 * @description 宏命令对象
 */
public class MenuCommand implements Command {

  /**
   * 用来记录组合本菜单的多道菜品，也就是多个命令对象
   */
  private Collection<Command> col = new ArrayList<Command>();

  /**
   * 点菜，把菜品加入到菜单中
   *
   * @param cmd 客户点的菜
   */
  public void addCommand(Command cmd) {
    col.add(cmd);
  }

  @Override
  public void execute() {
    //执行菜单其实就是循环执行菜单里面的每个菜
    for (Command cmd : col) {
      cmd.execute();
    }
  }
}
