package com.login.center.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "UserInfo对象", description = "")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户编号")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty(value = "用户登陆用户名")
    private String userName;

    @ApiModelProperty(value = "用户登陆密码")
    private String userPassword;

    @ApiModelProperty(value = "用户手机号码")
    private String mobile;

    @ApiModelProperty(value = "用户创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "用户更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "用户状态 0正常 -1失效")
    private Integer userStatus;


}
