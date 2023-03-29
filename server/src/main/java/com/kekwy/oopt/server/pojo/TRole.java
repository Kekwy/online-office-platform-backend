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
@Schema(name="TRole对象", description="")
public class TRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "名称")
    private String name;

    @Schema(name = "角色名称")
    @TableField("nameZh")
    private String nameZh;


}
