package com.sclabs.useraccount.validator;

import com.sclabs.useraccount.dto.CreateUserDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches,Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        CreateUserDto user = (CreateUserDto) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
