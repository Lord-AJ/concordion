package org.concordion.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConcordionScopedField {
    enum Scope {
        EXAMPLE,
        SPECIFICATION,
        GLOBAL
    }

    Scope scope() default Scope.SPECIFICATION;

    String value() default "";

}
