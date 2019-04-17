package com.login.center.controller;

import com.login.center.dto.UserInfo;
import com.login.center.service.LoginService;
import com.login.center.service.UserInfoService;
import com.service.common.dto.UserDTO;
import com.service.common.response.BaseResponse;
import com.service.common.response.ResponseSupport;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserInfoService userInfoService;


    @PostMapping("/login")
    public BaseResponse login(@RequestBody UserDTO userDTO) {
        loginService.login(userDTO);
        return ResponseSupport.ok();
    }

    @PostMapping("/addUser")
    public BaseResponse addUser(@RequestBody UserInfo userInfo) {
        userInfoService.addUser(userInfo);
        return ResponseSupport.ok();
    }


}
