package com.customValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BookConstraintValidation implements ConstraintValidator<IsValidBook, String>{

	
	private static final String NAME_PATTERN="^[A-Za-z]*$";
	
	private Pattern pattern;
	private Matcher matcher;
	
	
	public BookConstraintValidation() {
		pattern =Pattern.compile(NAME_PATTERN);
	}


	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
			return false;
		}
		
		matcher = pattern.matcher(value);
		return matcher.matches();
	}

}
