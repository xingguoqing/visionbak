package com.xinggq.pattern.composite.seconddemo;

import java.util.List;

/**
 * @author xinggq
 * @date 2019-08-01 14:36
 * @description
 */
public class Leaf extends Component {

  @Deprecated
  @Override
  public void add(Component component) throws UnsupportedOperationException{
    throw new UnsupportedOperationException();
  }

  @Deprecated
  @Override
  public void remove(Component component) throws UnsupportedOperationException{
    throw new UnsupportedOperationException();
  }

  @Deprecated
  @Override
  public List<Component> getChildren() throws UnsupportedOperationException{
    throw new UnsupportedOperationException();
  }
}
