package com.xinggq.pattern.observer;

import java.util.List;

/**
 * @author xinggq
 * @date 2019-07-17 15:38
 * @description
 */
public class Client {

  public static void main(String[] args) {

    HanFeiZi hanFeiZi = new HanFeiZi();
    LiSi liSi = new LiSi();
    hanFeiZi.addObserver(liSi);
    hanFeiZi.haveBreakfast();
  }

}
