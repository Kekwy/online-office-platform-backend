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
@Schema(name="TSalaryAdjust对象", description="")
public class TSalaryAdjust implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "员工ID")
    private Integer eid;

    @Schema(name = "调薪日期")
    @TableField("asDate")
    private LocalDate asDate;

    @Schema(name = "调前薪资")
    @TableField("beforeSalary")
    private Integer beforeSalary;

    @Schema(name = "调后薪资")
    @TableField("afterSalary")
    private Integer afterSalary;

    @Schema(name = "调薪原因")
    private String reason;

    @Schema(name = "备注")
    private String remark;


}
