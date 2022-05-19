package uz.anorbank.rjvalidation.constraint;

import uz.anorbank.rjvalidation.config.ConstraintViolationMsg;
import uz.anorbank.rjvalidation.handler.CmPatternValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CmPatternValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface CmPattern {
    String regexp();

    String message() default ConstraintViolationMsg.PATTERN_VIOLATION_MSG;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
