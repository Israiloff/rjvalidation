package uz.anorbank.rjvalidation.constraint;

import uz.anorbank.rjvalidation.config.ConstraintViolationMsg;
import uz.anorbank.rjvalidation.handler.CmNotEmptyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CmNotEmptyValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface CmNotEmpty {
    String message() default ConstraintViolationMsg.NOT_EMPTY_VIOLATION_MSG;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
