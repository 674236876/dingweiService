package com.myd.core;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by zhugp on 2017/3/10.
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyValidator.class)
public @interface NotEmpty {
        String message() default "not_empty";

        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};
}
