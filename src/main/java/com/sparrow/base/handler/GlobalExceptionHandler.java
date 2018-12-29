package com.sparrow.base.handler;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * Created by wancheng on 2018/12/23.
 */
@RestController
@RestControllerAdvice
public class GlobalExceptionHandler {

    private final static Integer BIND_ERROR_CODE = 501;

    /**
     * 对象参数bind 异常
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(BindException.class)
    public BindExceptionResponseData exceptionHandler(HttpServletRequest request, BindException ex){
        String url = request.getRequestURI();
        StringBuilder errorMesssage = new StringBuilder("校验失败:");
        errorMesssage.append(ex.getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(",")));

        return new BindExceptionResponseData(BIND_ERROR_CODE,url, errorMesssage.toString());
    }

    /**
     * 普通参数bind异常
     * @param request
     * @param ex
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public BindExceptionResponseData exception2Handler(HttpServletRequest request, ConstraintViolationException ex){
        String url = request.getRequestURI();
        StringBuilder errorMesssage = new StringBuilder("校验失败:");
        errorMesssage.append(ex.getMessage());

        return new BindExceptionResponseData(BIND_ERROR_CODE,url, errorMesssage.toString());
    }

}
