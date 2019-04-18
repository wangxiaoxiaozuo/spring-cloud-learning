package com.blog.service.service.fallback;

import com.blog.service.service.BlogService;
import com.blog.service.service.OrderInfoService;
import com.blog.service.service.UserInfoService;
import com.codingapi.txlcn.tc.support.DTXUserControls;
import com.codingapi.txlcn.tracing.TracingContext;
import com.service.common.dto.OrderInfo;
import com.service.common.dto.UserDTO;
import com.service.common.dto.UserInfo;
import com.service.common.response.BaseResponse;
import com.service.common.response.ResponseSupport;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wangjian
 * @Date: 2019/4/9 11:05
 * @Description: Hystrix 熔断机制回调
 */
@Component
@RequestMapping("/fallback")
public class BlogServiceFallBack implements BlogService, UserInfoService{


    @Override
    public BaseResponse login(UserDTO userDTO) {
        return ResponseSupport.fail("远程调用失败....");
    }

    @Override
    public BaseResponse addUser(UserInfo userInfo) {
        DTXUserControls.rollbackGroup(TracingContext.tracing().groupId());
        return ResponseSupport.fail("远程调用用户失败....");
    }


}
