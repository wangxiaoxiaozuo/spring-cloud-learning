package com.service.common.response;

import lombok.Getter;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 10:06
 * @Description:
 */
@Getter
public enum ResponseEnum {
    SERVER_ERROR("500", "服务器异常"),
    OK("0", "操作成功"),
    FAIL("-1", "操作失败");

    private String code;
    private String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
