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
@Schema(name="TEmployeeTrain对象", description="")
public class TEmployeeTrain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "员工编号")
    private Integer eid;

    @Schema(name = "培训日期")
    @TableField("trainDate")
    private LocalDate trainDate;

    @Schema(name = "培训内容")
    @TableField("trainContent")
    private String trainContent;

    @Schema(name = "备注")
    private String remark;


}
