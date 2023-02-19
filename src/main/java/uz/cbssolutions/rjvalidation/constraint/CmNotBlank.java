package uz.cbssolutions.rjvalidation.constraint;

import uz.cbssolutions.rjvalidation.config.ConstraintViolationMsg;
import uz.cbssolutions.rjvalidation.handler.CmNotBlankValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Not blank {@link java.lang.String} validator. The annotated element must not be null and must contain at least
 * one non-whitespace character.
 */
@Documented
@Constraint(validatedBy = CmNotBlankValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CmNotBlank {

    /**
     * Defines message for constraint violation.
     *
     * @return Constraint violation message.
     */
    String message() default ConstraintViolationMsg.NOT_BLANK_VIOLATION_MSG;

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
