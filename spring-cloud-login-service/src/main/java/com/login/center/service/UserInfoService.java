package com.login.center.service;

import com.login.center.dto.UserInfo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wangjian
 * @since 2019-04-17
 */
public interface UserInfoService {

    /**
     * @Author : wangjian
     * @Description 添加用户
     * @Date 2019/4/17 9:57
     * @Param [userInfo]
     * @Return void
     **/
    void addUser(UserInfo userInfo);

}
