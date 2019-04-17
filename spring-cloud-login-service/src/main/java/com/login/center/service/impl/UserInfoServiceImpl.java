package com.login.center.service.impl;

import com.login.center.dto.UserInfo;
import com.login.center.mapper.UserInfoMapper;
import com.login.center.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wangjian
 * @since 2019-04-17
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 1000)
//    @TccTransaction(propagation = DTXPropagation.SUPPORTS)
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }
}
