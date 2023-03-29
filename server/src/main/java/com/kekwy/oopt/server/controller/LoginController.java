package com.kekwy.oopt.server.controller;

import com.kekwy.oopt.server.pojo.AdminLoginParam;
import com.kekwy.oopt.server.pojo.RespBean;
import com.kekwy.oopt.server.pojo.TAdmin;
import com.kekwy.oopt.server.service.ITAdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Tag(name = "LoginController")
@RestController
public class LoginController {

    private final ITAdminService adminService;

    public LoginController(ITAdminService adminService) {
        this.adminService = adminService;
    }

    @Operation(description = "登录之后返回 token")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request, UserDetailsService service) {
        return adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword(), request);
    }

    @Operation(description = "获取当前用户的信息")
    @GetMapping("/admin/info")
    public TAdmin getAdminInfo(Principal principal) {
        if (null == principal) {
            return null;
        }
        String username = principal.getName();
        TAdmin admin = adminService.getAdminUserName(username);
        admin.setPassword(null);
        return admin;
    }

    @Operation(description = "退出登录")
    @PostMapping("/logout")
    public RespBean logout() {
        return RespBean.success("注销成功！");
    }

}
