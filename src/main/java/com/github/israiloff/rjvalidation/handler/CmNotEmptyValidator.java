package com.github.israiloff.rjvalidation.handler;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.github.israiloff.rjvalidation.constraint.CmNotEmpty;

import java.util.Collection;

/**
 * Constraint validator for {@link CmNotEmpty} annotation.
 */
public class CmNotEmptyValidator implements ConstraintValidator<CmNotEmpty, Collection<?>> {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid(Collection<?> s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.size() > 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(CmNotEmpty constraintAnnotation) {
    }
}
