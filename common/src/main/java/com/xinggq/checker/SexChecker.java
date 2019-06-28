package com.xinggq.checker;

import com.xinggq.annotation.CheckSex;
import com.xinggq.enums.SexEnum;
import com.xinggq.response.ICommonCode;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xinggq
 * @date 2019-06-26 10:26
 * @description
 */
public class SexChecker implements ConstraintValidator<CheckSex,String> {

  @Override
  public boolean isValid(String s, ConstraintValidatorContext context) {
    if(StringUtils.isEmpty(s)){
      return false;
    }
    if(!SexEnum.checkValue(s)){
      context.buildConstraintViolationWithTemplate(ICommonCode.SEX_NOT_LEGAL).addConstraintViolation();
      return false;
    }
    return true;
  }
}
