package uz.anorbank.rjvalidation.handler;

import uz.anorbank.rjvalidation.constraint.CmPattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CmPatternValidator implements ConstraintValidator<CmPattern, String> {

    private String pattern;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s == null || s.matches(pattern);
    }

    @Override
    public void initialize(CmPattern constraintAnnotation) {
        this.pattern = constraintAnnotation.regexp();
    }
}
