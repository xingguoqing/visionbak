package com.xinggq.checker;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xinggq
 * @date 2019-06-26 09:51
 * @description
 */
public class PhoneChecker implements ConstraintValidator<com.xinggq.annotation.CheckPhone,String> {

  @Override
  public void initialize(com.xinggq.annotation.CheckPhone constraintAnnotation) {

  }

  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    if(StringUtils.isEmpty(s)){
      return false;
    }
    //手机号规则校验暂时不加
    return true;
  }
}
