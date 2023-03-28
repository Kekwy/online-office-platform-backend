package com.kekwy.oopt.server.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kekwy.oopt.server.pojo.RespBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 当访问接口没有权限时，自定义返回结果
 *
 * @author Kekwy
 * @version 1.0
 * @since 2023/3/28 21:18
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {


    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException)
            throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter();
        PrintWriter out = response.getWriter();
        RespBean bean = RespBean.error("权限不足，请联系管理员！");
        bean.setCode(403);
        out.write(new ObjectMapper().writeValueAsString(bean));
        out.flush();
        out.close();
    }
}
