package uz.cbssolutions.rjvalidation.handler;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import uz.cbssolutions.rjvalidation.constraint.CmNotNull;

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
