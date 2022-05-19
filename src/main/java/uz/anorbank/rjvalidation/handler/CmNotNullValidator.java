package uz.anorbank.rjvalidation.handler;

import uz.anorbank.rjvalidation.constraint.CmNotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CmNotNullValidator implements ConstraintValidator<CmNotNull, Object> {

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        return obj != null;
    }

    @Override
    public void initialize(CmNotNull constraintAnnotation) {
    }
}
