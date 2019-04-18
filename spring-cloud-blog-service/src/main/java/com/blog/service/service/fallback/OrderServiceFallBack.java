package com.blog.service.service.fallback;

import com.blog.service.service.OrderInfoService;
import com.codingapi.txlcn.tc.support.DTXUserControls;
import com.codingapi.txlcn.tracing.TracingContext;
import com.service.common.dto.OrderInfo;
import com.service.common.response.BaseResponse;
import com.service.common.response.ResponseSupport;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wangjian
 * @Date: 2019/4/18 16:13
 * @Description:
 */
@Component
@RequestMapping("/orderFallback")
public class OrderServiceFallBack implements OrderInfoService {

    @Override
    public BaseResponse addOrder(OrderInfo orderInfo) {
        DTXUserControls.rollbackGroup(TracingContext.tracing().groupId());
        return ResponseSupport.fail("远程调用订单服务失败....");
    }
}
