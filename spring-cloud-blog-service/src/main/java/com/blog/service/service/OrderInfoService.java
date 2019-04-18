package com.blog.service.service;

import com.blog.service.service.fallback.BlogServiceFallBack;
import com.blog.service.service.fallback.OrderServiceFallBack;
import com.service.common.dto.OrderInfo;
import com.service.common.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: wangjian
 * @Date: 2019/4/18 15:17
 * @Description:
 */
@FeignClient(value = "ORDER-SERVICE",fallback = OrderServiceFallBack.class)
public interface OrderInfoService {

    @PostMapping(value = "/order/addOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    BaseResponse addOrder(OrderInfo orderInfo);

}
