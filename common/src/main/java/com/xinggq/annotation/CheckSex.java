package com.xinggq.annotation;

import com.xinggq.checker.SexChecker;
import com.xinggq.response.ICommonCode;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author xinggq
 * @date 2019-06-26 10:25
 * @description
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {SexChecker.class})
public @interface CheckSex {

  String message() default ICommonCode.SEX_NOT_EMPTY;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
