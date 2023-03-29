package com.kekwy.oopt.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
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
@Schema(name="TSalary对象", description="")
public class TSalary implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "基本工资")
    @TableField("basicSalary")
    private Integer basicSalary;

    @Schema(name = "奖金")
    private Integer bonus;

    @Schema(name = "午餐补助")
    @TableField("lunchSalary")
    private Integer lunchSalary;

    @Schema(name = "交通补助")
    @TableField("trafficSalary")
    private Integer trafficSalary;

    @Schema(name = "应发工资")
    @TableField("allSalary")
    private Integer allSalary;

    @Schema(name = "养老金基数")
    @TableField("pensionBase")
    private Integer pensionBase;

    @Schema(name = "养老金比率")
    @TableField("pensionPer")
    private Float pensionPer;

    @Schema(name = "启用时间")
    @TableField("createDate")
    private LocalDateTime createDate;

    @Schema(name = "医疗基数")
    @TableField("medicalBase")
    private Integer medicalBase;

    @Schema(name = "医疗保险比率")
    @TableField("medicalPer")
    private Float medicalPer;

    @Schema(name = "公积金基数")
    @TableField("accumulationFundBase")
    private Integer accumulationFundBase;

    @Schema(name = "公积金比率")
    @TableField("accumulationFundPer")
    private Float accumulationFundPer;

    @Schema(name = "名称")
    private String name;


}
