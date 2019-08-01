package com.xinggq.pattern.composite.firstdemo;


/**
 *
 *
 * 这个是安全模式。树枝节点和叶子节点是完全分开的，树枝节点单独拥有用来组合树的方法，叶子节点没有。
 * @author xinggq
 * @date 2019-08-01 14:05
 * @description
 */
public class Client {

  public static void main(String[] args) {

    Composite root = new Composite();
    root.doSomething();

    Composite branch = new Composite();

    Leaf leaf = new Leaf();
    root.add(branch);
    branch.add(leaf);

  }


  public static void display(Composite root){
    for(Component c : root.getChildren()){
      if(c instanceof Leaf){
        c.doSomething();
      }else {
        display((Composite) c);
      }
    }
  }


}
