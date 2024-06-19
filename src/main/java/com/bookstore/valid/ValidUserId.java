package com.bookstore.valid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUserIdValidator.class)
public @interface ValidUserId {
    String message() default "ID 0 Hợp Lệ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
