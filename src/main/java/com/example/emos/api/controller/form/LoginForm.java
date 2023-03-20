package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Schema(description = "登录表单类")
public class LoginForm {
    @NotBlank(message = "用户名为空")
    @Schema(description = "用户姓名")
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message = "username内容不正确")
    private String userName;

    @NotBlank(message = "用户密码为空")
    @Schema(description = "用户密码")
    //todo:正则表达式 系统学习一下：https://goregex.cn/regex-intro.html
    @Pattern(regexp = "^[a-zA-Z0-9]{6,20}$", message = "password内容不正确")
    private String passWord;
}
