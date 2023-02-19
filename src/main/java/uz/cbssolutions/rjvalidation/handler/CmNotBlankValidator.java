package uz.cbssolutions.rjvalidation.handler;

import uz.cbssolutions.rjvalidation.constraint.CmNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
