package com.github.israiloff.rjvalidation.handler;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.github.israiloff.rjvalidation.constraint.CmPattern;

/**
 * Constraint validator for {@link CmPattern} annotation.
 */
public class CmPatternValidator implements ConstraintValidator<CmPattern, String> {

    private String pattern;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s == null || s.matches(pattern);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(CmPattern constraintAnnotation) {
        this.pattern = constraintAnnotation.regexp();
    }
}
