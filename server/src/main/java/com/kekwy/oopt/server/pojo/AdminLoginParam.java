package com.kekwy.oopt.server.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

/**
 * 登录实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Schema(name = "AdminLogin对象", description = "")
public class AdminLoginParam {
    @Schema(name = "用户名", requiredMode = REQUIRED)
    private String username;
    @Schema(name = "密码", requiredMode = REQUIRED)
    private String password;
}
