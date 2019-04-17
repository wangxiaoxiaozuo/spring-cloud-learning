package com.blog.service.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@ApiModel(value="BlogInfo对象", description="")
public class BlogInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "博客ID")
    @TableId(value = "blog_id", type = IdType.AUTO)
    private Integer blogId;

    @ApiModelProperty(value = "作者编号")
    private Integer userId;

    @ApiModelProperty(value = "博客标题")
    private String blogTittle;

    @ApiModelProperty(value = "博客创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "博客更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "博客状态")
    private Integer status;


}
