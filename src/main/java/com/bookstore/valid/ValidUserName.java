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
@Constraint(validatedBy = ValidUserNameValidator.class)
public @interface ValidUserName {
    String message() default "Đã Tồn Tại";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
