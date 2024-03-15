package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class MaxInvPartValidator implements ConstraintValidator<ValidMaxInvPart, Part> {
    @Override
    public void initialize(ValidMaxInvPart constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part.getInv() <= part.getMaxInv()) return true;
        else return false;
    }
}
