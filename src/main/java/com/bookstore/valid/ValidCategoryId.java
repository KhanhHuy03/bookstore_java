package com.bookstore.valid;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
public @interface ValidCategoryId{
    String message() default "Danh Mục 0 Hợp Lệ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
