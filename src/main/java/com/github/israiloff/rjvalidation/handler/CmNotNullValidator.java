package com.github.israiloff.rjvalidation.handler;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.github.israiloff.rjvalidation.constraint.CmNotNull;

/**
 * Constraint validator for {@link CmNotNull} annotation.
 */
public class CmNotNullValidator implements ConstraintValidator<CmNotNull, Object> {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        return obj != null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(CmNotNull constraintAnnotation) {
    }
}
