package com.blog.service.service;

import com.blog.service.service.fallback.BlogServiceFallBack;
import com.service.common.dto.UserDTO;
import com.service.common.dto.UserInfo;
import com.service.common.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 11:03
 * @Description:
 */
//@FeignClient(value = "LOGIN-SERVICE", fallback = BlogServiceFallBack.class)
//@Component
public interface BlogService {


    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    BaseResponse login(@RequestBody UserDTO userDTO);




}
