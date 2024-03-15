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
public class MinInvPartValidator implements ConstraintValidator<ValidMinInvPart, Part> {
    @Override
    public void initialize(ValidMinInvPart constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part.getInv() >= part.getMinInv()) return true;
        else return false;
    }
}
