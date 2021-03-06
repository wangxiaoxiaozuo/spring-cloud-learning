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
 * @since 2019-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    public UserInfo() {
    }

    public UserInfo(String userName, String userPassword, String mobile) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.mobile = mobile;
    }

    private Integer userId;

    private String userName;

    private String userPassword;

    private String mobile;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer userStatus;


}
