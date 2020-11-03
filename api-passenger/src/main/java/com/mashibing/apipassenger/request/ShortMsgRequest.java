package com.mashibing.apipassenger.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class ShortMsgRequest {
    /**
     * 自定义 校验手机号的注解
     */
    //@PhoeNumberValidation
    /**
     * 通过正则校验
     */
    @NotNull(message = "手机号不能为空")
    @Pattern(message = "手机号校验不正确",regexp = "((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9])))")
    private String phoneNumber;
}
