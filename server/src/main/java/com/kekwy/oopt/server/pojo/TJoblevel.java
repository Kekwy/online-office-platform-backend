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
@Schema(name="TJoblevel对象", description="")
public class TJoblevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "职称名称")
    private String name;

    @Schema(name = "职称等级")
    @TableField("titleLevel")
    private String titleLevel;

    @Schema(name = "创建时间")
    @TableField("createDate")
    private LocalDateTime createDate;

    @Schema(name = "是否启用")
    private Boolean enabled;


}
