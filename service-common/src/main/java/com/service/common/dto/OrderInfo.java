package com.service.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangjian
 * @since 2019-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    public OrderInfo(String orderName, String orderDes) {
        this.orderName = orderName;
        this.orderDes = orderDes;
    }
    public OrderInfo() {
    }

    private Integer id;

    private String orderName;

    private String orderDes;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer state;


}
