package uz.cbssolutions.rjvalidation.constraint;

import uz.cbssolutions.rjvalidation.config.ConstraintViolationMsg;
import uz.cbssolutions.rjvalidation.handler.CmPatternValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotated {@link java.lang.String} element must match to the specified regular expression (regex)
 * or must be null.
 */
@Documented
@Constraint(validatedBy = CmPatternValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CmPattern {

    /**
     * Defines the target regular expression (regex).
     *
     * @return Regular expression.
     */
    String regexp();

    /**
     * Defines message for constraint violation.
     *
     * @return Constraint violation message.
     */
    String message() default ConstraintViolationMsg.PATTERN_VIOLATION_MSG;

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
