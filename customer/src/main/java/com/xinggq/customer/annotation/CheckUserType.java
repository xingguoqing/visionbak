package com.xinggq.customer.annotation;//package com.xinggq.customer.annotation;
//
//import com.xinggq.checker.PageNumChecker;
//import com.xinggq.response.ICommonCode;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//import javax.validation.Constraint;
//import javax.validation.Payload;
//
///**
// * @author xinggq
// * @date 2019-06-26 14:49
// * @description
// */
//@Target({ElementType.FIELD})
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = PageNumChecker.class)
//public @interface CheckUserType {
//  String message() default ICommonCode.PAGENUM_LEGAL;
//
//  Class<?>[] groups() default {};
//
//  Class<? extends Payload>[] payload() default {};
//}
