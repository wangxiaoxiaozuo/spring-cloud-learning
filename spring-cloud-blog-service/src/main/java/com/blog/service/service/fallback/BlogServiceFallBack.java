package com.blog.service.service.fallback;

import com.blog.service.service.BlogService;
import com.service.common.dto.UserDTO;
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
public class BlogServiceFallBack implements BlogService {


    @Override
    public BaseResponse login(UserDTO userDTO) {
        return ResponseSupport.fail("远程调用失败....");
    }
}
