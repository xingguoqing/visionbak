package com.xinggq.checker;

import com.xinggq.annotation.CheckLoanType;
import com.xinggq.enums.LoanTypeEnum;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author xinggq
 * @date 2019-07-01 16:43
 * @description
 */
public class LoanTypeChecker implements ConstraintValidator<CheckLoanType,String> {

  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    return LoanTypeEnum.checkCode(s);
  }
}
