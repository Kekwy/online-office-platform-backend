package com.kekwy.oopt.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
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
@Schema(name="TDepartment对象", description="")
public class TDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "部门名称")
    private String name;

    @Schema(name = "父id")
    @TableField("parentId")
    private Integer parentId;

    @Schema(name = "路径")
    @TableField("depPath")
    private String depPath;

    @Schema(name = "是否启用")
    private Boolean enabled;

    @Schema(name = "是否上级")
    @TableField("isParent")
    private Boolean isParent;


}
