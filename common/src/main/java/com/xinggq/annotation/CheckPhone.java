package com.xinggq.annotation;

import com.xinggq.checker.PhoneChecker;
import com.xinggq.response.ICommonCode;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author xinggq
 * @date 2019-06-26 09:47
 * @description
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PhoneChecker.class})
public @interface CheckPhone {

  String message() default ICommonCode.PHONE_NOT_EMPTY;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};


}
