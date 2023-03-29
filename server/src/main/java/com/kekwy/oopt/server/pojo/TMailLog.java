package com.kekwy.oopt.server.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Kekwy
 * @since 2023-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name="TMailLog对象", description="")
public class TMailLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "消息id")
    @TableId("msgId")
    private String msgId;

    @Schema(name = "接收员工id")
    private Integer eid;

    @Schema(name = "状态（0:消息投递中 1:投递成功 2:投递失败）")
    private Integer status;

    @Schema(name = "路由键")
    @TableField("routeKey")
    private String routeKey;

    @Schema(name = "交换机")
    private String exchange;

    @Schema(name = "重试次数")
    private Integer count;

    @Schema(name = "重试时间")
    @TableField("tryTime")
    private LocalDateTime tryTime;

    @Schema(name = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    @Schema(name = "更新时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;


}
