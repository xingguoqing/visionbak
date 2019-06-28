package com.xinggq.annotation;

import com.xinggq.checker.PageSizeChecker;
import com.xinggq.response.ICommonCode;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author xinggq
 * @date 2019-06-26 13:31
 * @description
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PageSizeChecker.class)
public @interface CheckPageSize {
  String message() default ICommonCode.PAGESIZE_LEGAL;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
