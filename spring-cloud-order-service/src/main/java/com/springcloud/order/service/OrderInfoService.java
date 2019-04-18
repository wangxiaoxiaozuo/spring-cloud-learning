package com.springcloud.order.service;

import com.springcloud.order.dto.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangjian
 * @since 2019-04-18
 */
public interface OrderInfoService{

    void addOrder(OrderInfo orderInfo);
}
