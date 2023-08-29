package com.github.israiloff.rjvalidation.handler;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.github.israiloff.rjvalidation.constraint.CmNotBlank;

/**
 * Constraint validator for {@link CmNotBlank} annotation.
 */
public class CmNotBlankValidator implements ConstraintValidator<CmNotBlank, String> {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.length() > 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(CmNotBlank constraintAnnotation) {
    }
}