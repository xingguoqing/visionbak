package com.xinggq.checker;

import com.xinggq.annotation.CheckInsuranceType;
import com.xinggq.enums.InsuranceEnum;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author xinggq
 * @date 2019-07-01 16:43
 * @description
 */
public class InsuranceTypeChecker implements ConstraintValidator<CheckInsuranceType,String> {

  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    return InsuranceEnum.checkCode(s);
  }
}
