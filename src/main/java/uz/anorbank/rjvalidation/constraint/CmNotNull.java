package uz.anorbank.rjvalidation.constraint;

import uz.anorbank.rjvalidation.config.ConstraintViolationMsg;
import uz.anorbank.rjvalidation.handler.CmNotNullValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CmNotNullValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface CmNotNull {
    String message() default ConstraintViolationMsg.NOT_NULL_VIOLATION_MSG;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
