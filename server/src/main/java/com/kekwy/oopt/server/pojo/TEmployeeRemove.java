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
@Schema(name="TEmployeeRemove对象", description="")
public class TEmployeeRemove implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "员工id")
    private Integer eid;

    @Schema(name = "调动后部门")
    @TableField("afterDepId")
    private Integer afterDepId;

    @Schema(name = "调动后职位")
    @TableField("afterJobId")
    private Integer afterJobId;

    @Schema(name = "调动日期")
    @TableField("removeDate")
    private LocalDate removeDate;

    @Schema(name = "调动原因")
    private String reason;

    @Schema(name = "备注")
    private String remark;


}
