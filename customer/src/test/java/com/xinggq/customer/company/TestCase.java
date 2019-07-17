package com.xinggq.customer.company;

import java.lang.annotation.Annotation;
import org.junit.Test;

/**
 * @author xinggq
 * @date 2019-07-11 19:36
 * @description
 */
public class TestCase implements Test {

  @Override
  public Class<? extends Throwable> expected() {
    return null;
  }

  @Override
  public long timeout() {
    return 0;
  }

  @Override
  public Class<? extends Annotation> annotationType() {
    return null;
  }
}
