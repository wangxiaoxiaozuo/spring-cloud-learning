package com.blog.service.service.impl;

import com.blog.service.dto.BlogInfo;
import com.blog.service.mapper.BlogInfoMapper;
import com.blog.service.service.BlogInfoService;
import com.blog.service.service.OrderInfoService;
import com.blog.service.service.UserInfoService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.service.common.dto.OrderInfo;
import com.service.common.dto.UserInfo;
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
public class BlogInfoServiceImpl implements BlogInfoService {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private BlogInfoMapper blogInfoMapper;

    @Autowired
    private OrderInfoService orderInfoService;

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 1000)
    //事务发起者
    @LcnTransaction
    public void addBlog(BlogInfo blogInfo) {
        //博客业务
        blogInfoMapper.insert(blogInfo);
        //用户服务
        userInfoService.addUser(new UserInfo("王建", "123456", "17301050224"));
        //订单服务
        orderInfoService.addOrder(new OrderInfo("王建的订单", "这是一个订单哦"));
    }
}
