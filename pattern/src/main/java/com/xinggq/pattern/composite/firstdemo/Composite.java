package com.xinggq.pattern.composite.firstdemo;


import java.util.ArrayList;
import java.util.List;

/**
 * @author xinggq
 * @date 2019-08-01 14:03
 * @description 树枝节点
 */
public class Composite extends Component {

  private List<Component> componentList = new ArrayList<>();

  /**
   * 添加子节点
   * @param component
   */
  public void add(Component component) {
    componentList.add(component);
  }

  /**
   * 删除子节点
   * @param component
   */
  public void remove(Component component) {
    this.componentList.remove(component);
  }

  /**
   * 遍历所有的子节点
   * @return
   */
  public List<Component> getChildren() {
    return this.componentList;
  }

}
