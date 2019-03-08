package com.sclabs.useraccount.UserAccount.util;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Author Vikas Dahiya
 * A custom validator used to validate the email on server side
 * Can be used as an annotation {@ValidEmail}
 * Will be implemented in EmailValidator class
 */

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {
    String message() default "Invalid email";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
