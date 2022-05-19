package uz.anorbank.rjvalidation.handler;

import uz.anorbank.rjvalidation.constraint.CmNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CmNotBlankValidator implements ConstraintValidator<CmNotBlank, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.length() > 0;
    }

    @Override
    public void initialize(CmNotBlank constraintAnnotation) {
    }
}
