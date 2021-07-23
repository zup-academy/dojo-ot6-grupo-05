package br.com.zupedu.dojo.ot4dojo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueValidator.class)
public @interface Unique {

    Class[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String message() default "Atributo repetido";
    String fieldName();
    Class<?> clazz();
}
