package uz.cbssolutions.rjvalidation.handler;

import uz.cbssolutions.rjvalidation.constraint.CmSize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CmSizeValidator implements ConstraintValidator<CmSize, String> {

    private int min;
    private int max;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.length() >= min && s.length() <= max;
    }

    @Override
    public void initialize(CmSize constraintAnnotation) {
        this.max = constraintAnnotation.max();
        this.min = constraintAnnotation.min();
    }
}
