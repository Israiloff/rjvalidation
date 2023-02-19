package uz.cbssolutions.rjvalidation.handler;

import uz.cbssolutions.rjvalidation.constraint.CmPattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
