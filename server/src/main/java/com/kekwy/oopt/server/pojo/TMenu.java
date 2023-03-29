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
@Schema(name="TMenu对象", description="")
public class TMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "url")
    private String url;

    @Schema(name = "path")
    private String path;

    @Schema(name = "组件")
    private String component;

    @Schema(name = "菜单名")
    private String name;

    @Schema(name = "图标")
    @TableField("iconCls")
    private String iconCls;

    @Schema(name = "是否保持激活")
    @TableField("keepAlive")
    private Boolean keepAlive;

    @Schema(name = "是否要求权限")
    @TableField("requireAuth")
    private Boolean requireAuth;

    @Schema(name = "父id")
    @TableField("parentId")
    private Integer parentId;

    @Schema(name = "是否启用")
    private Boolean enabled;


}
