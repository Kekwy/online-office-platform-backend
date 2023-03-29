package com.kekwy.oopt.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
@Schema(name="TEmployeeEc对象", description="")
public class TEmployeeEc implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "员工编号")
    private Integer eid;

    @Schema(name = "奖罚日期")
    @TableField("ecDate")
    private LocalDate ecDate;

    @Schema(name = "奖罚原因")
    @TableField("ecReason")
    private String ecReason;

    @Schema(name = "奖罚分")
    @TableField("ecPoint")
    private Integer ecPoint;

    @Schema(name = "奖罚类别，0：奖，1：罚")
    @TableField("ecType")
    private Integer ecType;

    @Schema(name = "备注")
    private String remark;


}
