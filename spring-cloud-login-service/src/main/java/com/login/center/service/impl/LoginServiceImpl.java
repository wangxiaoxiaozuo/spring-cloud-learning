package com.login.center.service.impl;


import com.login.center.service.LoginService;
import com.service.common.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 09:22
 * @Description:
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Override
    public void login(UserDTO userDTO) {
        if (userDTO != null &&
                userDTO.getUserName().equalsIgnoreCase("wangj") &&
            userDTO.getPassWord().equals("123456")) {
            log.info("登陆成功");
        }
    }
}
