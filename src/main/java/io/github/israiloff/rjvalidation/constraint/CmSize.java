package io.github.israiloff.rjvalidation.constraint;

import io.github.israiloff.rjvalidation.config.ConstraintViolationMsg;
import io.github.israiloff.rjvalidation.handler.CmSizeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotated {@link java.lang.String} element size must be between the specified boundaries (included).
 */
@Documented
@Constraint(validatedBy = CmSizeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CmSize {

    /**
     * Defines the minimum length of element.
     *
     * @return Minimum length value.
     */
    int min() default 0;

    /**
     * Defines the maximum length of element.
     *
     * @return Maximum length value.
     */
    int max() default 2147483647;

    /**
     * Defines message for constraint violation.
     *
     * @return Constraint violation message.
     */
    String message() default ConstraintViolationMsg.SIZE_VIOLATION_MSG;

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
