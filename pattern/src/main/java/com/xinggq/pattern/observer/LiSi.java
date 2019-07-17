package com.xinggq.pattern.observer;

/**
 * @author xinggq
 * @date 2019-07-17 15:38
 * @description 李斯，负责监听韩非子
 */
public class LiSi implements Observer{

  @Override
  public void action(String contxt) {
    System.out.println("李斯发现："+contxt);
  }
}
