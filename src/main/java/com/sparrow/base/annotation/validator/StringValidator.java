package com.sparrow.base.annotation.validator;


import com.sparrow.base.annotation.StringValidated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by wancheng on 2019/1/19.
 */
public class StringValidator implements ConstraintValidator<StringValidated,String> {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public void initialize(StringValidated constraintAnnotation) {
        logger.info("初始化StringValidated注解");
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //返回false代表校验失败，true代表校验通过
        return false;
    }

}
