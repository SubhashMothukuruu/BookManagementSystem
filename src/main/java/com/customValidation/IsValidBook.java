package com.customValidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = BookConstraintValidation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface IsValidBook {
	
	
	String message() default "Name should be contain Integer values.";
	
	Class<?>[] group() default{};
	Class<? extends Payload>[] payload() default{};

}
