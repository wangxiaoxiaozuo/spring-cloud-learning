package com.blog.service.controller;

import com.blog.service.service.BlogService;
import com.service.common.dto.UserDTO;
import com.service.common.response.BaseResponse;
import com.service.common.response.ResponseSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 11:03
 * @Description:
 */
@RestController
public class BlogController {


    @Autowired
    private BlogService blogService;

    @PostMapping("/user/login")
    public BaseResponse login(UserDTO userDTO) {
        return  blogService.login(userDTO);
    }


}
