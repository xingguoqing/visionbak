package com.xinggq.checker;

import com.xinggq.annotation.CheckPageNum;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author xinggq
 * @date 2019-06-26 11:32
 * @description
 */
public class PageNumChecker implements ConstraintValidator<CheckPageNum,Integer> {

  @Override
  public boolean isValid(Integer pageNum, ConstraintValidatorContext constraintValidatorContext) {
    if (pageNum == null || pageNum < 1) {
      return false;
    }
    return true;
  }
}
