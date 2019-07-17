package com.xinggq.pattern.command.firstdemo.reciver;

/**
 * @author xinggq
 * @date 2019-07-12 09:49
 * @description
 */
public class AigoMainBoard implements MainBoardApi {

  @Override
  public void open() {
    System.out.println("爱国者主板现在正在开机，请等候");
    System.out.println("接通电源......");
    System.out.println("设备检查......");
    System.out.println("装载系统......");
    System.out.println("机器正常运转起来......");
    System.out.println("机器已经正常打开，请操作");
  }
}
