package com.login.center.controller;

import com.login.center.service.LoginService;
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
 * @Date: 2019/4/9 09:21
 * @Description:
 */
@RestController
public class LoginController {


    @Autowired
    private LoginService loginService;


    @PostMapping("/login")
    public BaseResponse login(@RequestBody UserDTO userDTO){
        loginService.login(userDTO);
        return ResponseSupport.ok();
    }
}
