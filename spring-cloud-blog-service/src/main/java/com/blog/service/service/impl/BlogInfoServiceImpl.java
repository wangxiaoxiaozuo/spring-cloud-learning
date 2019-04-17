package com.blog.service.service.impl;

import com.blog.service.dto.BlogInfo;
import com.blog.service.mapper.BlogInfoMapper;
import com.blog.service.service.BlogInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.service.service.UserInfoService;
import com.service.common.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangjian
 * @since 2019-04-17
 */
@Service
public class BlogInfoServiceImpl implements BlogInfoService {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private BlogInfoMapper blogInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class,timeout = 1000)
    public void addBlog(BlogInfo blogInfo) {
        blogInfoMapper.insert(blogInfo);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("王建");
        userInfo.setUserPassword("123456");
        userInfo.setMobile("17301050224");
        userInfoService.addUser(userInfo);
    }
}
