package org.hibernate.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {
    String[] stringValue() default {};
    boolean[] booleanValue() default {};
    String[] enumStringValue() default {};
}
