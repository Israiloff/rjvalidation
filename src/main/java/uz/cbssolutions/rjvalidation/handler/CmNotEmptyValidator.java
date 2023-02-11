package uz.cbssolutions.rjvalidation.handler;

import uz.cbssolutions.rjvalidation.constraint.CmNotEmpty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class CmNotEmptyValidator implements ConstraintValidator<CmNotEmpty, List<?>> {

    @Override
    public boolean isValid(List<?> s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.size() > 0;
    }

    @Override
    public void initialize(CmNotEmpty constraintAnnotation) {
    }
}
