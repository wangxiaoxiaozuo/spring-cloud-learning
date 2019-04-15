package com.service.common.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 09:28
 * @Description: 全局返回
 */
@Data
public class BaseResponse implements Serializable {
    private String code;
    private String msg;
    private Object data;

}
