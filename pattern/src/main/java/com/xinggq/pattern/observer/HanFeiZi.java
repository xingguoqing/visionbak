package com.xinggq.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-07-17 15:26
 * @description 韩非子
 */
public class HanFeiZi implements Observable {

  private List<Observer> observers = new ArrayList<>();

  @Override
  public void addObserver(Observer observable) {
    observers.add(observable);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(String context) {
    for (Observer observer : observers) {
      observer.action(context);
    }
  }

  /**
   * 具体业务方法
   */
  public void haveBreakfast() {
    System.out.println("韩非子要开始吃早饭了...");
    notifyObservers("韩非子要开始吃早饭了...");
  }
}
