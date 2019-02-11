package com.sparrow.base.annotation;



import com.sparrow.base.annotation.validator.StringValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by wancheng on 2019/1/19.
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })//作用于的类型，此处为对象的属性
@Retention(RetentionPolicy.RUNTIME)//运行时生效
@Constraint(validatedBy = StringValidator.class)
@NotNull(message = "{username.length.error}")
@Documented
@Inherited
public @interface StringValidated {
    String filed() default "{com.sparrow.base.annotation.validator.StringValidator.filed}";
    String message() default "{com.sparrow.base.annotation.validator.StringValidator.message}";//必填，校验未通过时的提示信息
    Class<?>[] groups() default {};//必填，下文会将到此参数的作用
    Class<? extends Payload>[] payload() default {};//必填

}
