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
@Schema(name="TAppraise对象", description="")
public class TAppraise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "员工id")
    private Integer eid;

    @Schema(name = "考评日期")
    @TableField("appDate")
    private LocalDate appDate;

    @Schema(name = "考评结果")
    @TableField("appResult")
    private String appResult;

    @Schema(name = "考评内容")
    @TableField("appContent")
    private String appContent;

    @Schema(name = "备注")
    private String remark;


}
