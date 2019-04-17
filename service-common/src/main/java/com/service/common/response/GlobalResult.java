package com.service.common.response;

import lombok.Data;

/**
 * @Auther: wangjian
 * @Date: 2019/4/16 17:20
 * @Description: 全局返回值
 */
@Data
public class GlobalResult<T> {

    private String code;
    private String msg;
    private T data;


}
