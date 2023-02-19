package uz.cbssolutions.rjvalidation.constraint;

import uz.cbssolutions.rjvalidation.config.ConstraintViolationMsg;
import uz.cbssolutions.rjvalidation.handler.CmNotEmptyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * The annotated {@link java.util.Collection} element must not be null nor empty.
 */
@Documented
@Constraint(validatedBy = CmNotEmptyValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CmNotEmpty {

    /**
     * Defines message for constraint violation.
     *
     * @return Constraint violation message.
     */
    String message() default ConstraintViolationMsg.NOT_EMPTY_VIOLATION_MSG;

    /**
     * Defines the type groups.
     *
     * @return Groups.
     */
    Class<?>[] groups() default {};

    /**
     * Defines the payload.
     *
     * @return Payload.
     */
    Class<? extends Payload>[] payload() default {};
}
