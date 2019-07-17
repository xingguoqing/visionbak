package com.xinggq.pattern.observer;

/**
 * @author xinggq
 * @date 2019-07-17 15:20
 * @description 被观察者接口，负责管理所有的观察者
 */
public interface Observable {

  void addObserver(Observer observable);

  void removeObserver(Observer observer);

  void notifyObservers(String context);

}
