package com.sclabs.useraccount.UserAccount.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Author Vikas Dahiya
 * A custom annotation to validate password matches
 * Check with annotation @PasswordMatches
 * Validated by class PasswordMatchesValidator
 */

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {
    String message() default "Password doesn't matches";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
