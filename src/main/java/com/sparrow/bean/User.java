package com.sparrow.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

/**
 * Created by wancheng on 2018/12/29.
 */
@Data
@Accessors(chain = true)
public class User {
    @NotEmpty(message = "用户名不能为空")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    private String password;
}
