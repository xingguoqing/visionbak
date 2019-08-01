package com.xinggq.pattern.composite.seconddemo;



/**
 *
 *
 * 这个是透明模式。使用的都是顶层接口或者抽象类
 * @author xinggq
 * @date 2019-08-01 14:05
 * @description
 */
public class Client {

  public static void main(String[] args) {

    Component root = new Composite();
    root.doSomething();

    Component branch = new Composite();

    Component leaf = new Leaf();
    root.add(branch);
    branch.add(leaf);

  }


  public static void display(Component root){
    for(Component c : root.getChildren()){
      if(c instanceof Leaf){
        c.doSomething();
      }else {
        display(c);
      }
    }
  }


}
