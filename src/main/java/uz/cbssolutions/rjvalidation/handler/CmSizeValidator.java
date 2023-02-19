package uz.cbssolutions.rjvalidation.handler;

import uz.cbssolutions.rjvalidation.constraint.CmSize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
