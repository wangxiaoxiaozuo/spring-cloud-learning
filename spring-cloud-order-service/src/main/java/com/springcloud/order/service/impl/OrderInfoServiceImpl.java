package com.springcloud.order.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.springcloud.order.dto.OrderInfo;
import com.springcloud.order.mapper.OrderInfoMapper;
import com.springcloud.order.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangjian
 * @since 2019-04-18
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class, timeout = 1000)
    @TccTransaction(propagation = DTXPropagation.SUPPORTS)
    public void addOrder(OrderInfo orderInfo) {
        orderInfoMapper.insert(orderInfo);
    }
}
