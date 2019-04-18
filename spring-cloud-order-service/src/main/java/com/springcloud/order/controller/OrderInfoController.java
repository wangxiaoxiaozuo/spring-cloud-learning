package com.springcloud.order.controller;


import com.service.common.response.BaseResponse;
import com.service.common.response.ResponseSupport;
import com.springcloud.order.dto.OrderInfo;
import com.springcloud.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wangjian
 * @since 2019-04-18
 */
@RestController
@RequestMapping("/order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @PostMapping("/addOrder")
    public BaseResponse addOrder(@RequestBody OrderInfo orderInfo) {
        orderInfoService.addOrder(orderInfo);
        return ResponseSupport.ok();
    }
}
