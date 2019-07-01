package com.xinggq.annotation;

import com.xinggq.checker.InsuranceTypeChecker;
import com.xinggq.checker.LoanTypeChecker;
import com.xinggq.response.ICommonCode;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author xinggq
 * @date 2019-07-01 16:43
 * @description
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LoanTypeChecker.class)
public @interface CheckLoanType {

  String message() default ICommonCode.PAGENUM_LEGAL;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
