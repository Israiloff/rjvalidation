package io.github.israiloff.rjvalidation.handler;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import io.github.israiloff.rjvalidation.constraint.CmSize;

/**
 * Constraint validator for {@link CmSize} annotation.
 */
public class CmSizeValidator implements ConstraintValidator<CmSize, String> {

    private int min;
    private int max;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.length() >= min && s.length() <= max;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(CmSize constraintAnnotation) {
        this.max = constraintAnnotation.max();
        this.min = constraintAnnotation.min();
    }
}
