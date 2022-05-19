package uz.anorbank.rjvalidation.constraint;

import uz.anorbank.rjvalidation.config.ConstraintViolationMsg;
import uz.anorbank.rjvalidation.handler.CmSizeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CmSizeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CmSize {
    int min() default 0;

    int max() default 2147483647;

    String message() default ConstraintViolationMsg.SIZE_VIOLATION_MSG;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
