package com.sparrow.bean;

import com.sparrow.base.annotation.StringValidated;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * Created by wancheng on 2018/12/29.
 */
@Data
@Accessors(chain = true)
public class User {
    @Length(max = 1,min = 1,message = "{username.length.error}")
    private String userName;
    @StringValidated(filed = "password",message = "{filed}不能为空")
    private String password;
}
