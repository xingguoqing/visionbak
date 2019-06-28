package com.xinggq.checker;

import com.xinggq.annotation.CheckPageSize;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author xinggq
 * @date 2019-06-26 13:32
 * @description
 */
public class PageSizeChecker implements ConstraintValidator<CheckPageSize, Integer> {

  @Override
  public boolean isValid(Integer pageSize, ConstraintValidatorContext constraintValidatorContext) {
    if (pageSize == null || pageSize < 0 || pageSize > 50) {
      return false;
    }
    return true;
  }
}
