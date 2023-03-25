package com.kekwy.oopt.server.service;

import com.kekwy.oopt.server.pojo.RespBean;
import com.kekwy.oopt.server.pojo.TAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Kekwy
 * @since 2023-03-23
 */
public interface ITAdminService extends IService<TAdmin> {

    /**
     * 登录之后返回 token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    TAdmin getAdminUserName(String username);

}
