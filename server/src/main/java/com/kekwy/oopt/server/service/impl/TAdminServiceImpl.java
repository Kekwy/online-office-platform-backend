package com.kekwy.oopt.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kekwy.oopt.server.config.security.JwtTokenUtil;
import com.kekwy.oopt.server.pojo.RespBean;
import com.kekwy.oopt.server.pojo.TAdmin;
import com.kekwy.oopt.server.mapper.TAdminMapper;
import com.kekwy.oopt.server.service.ITAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Kekwy
 * @since 2023-03-23
 */
@Service
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper, TAdmin> implements ITAdminService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TAdminMapper adminMapper;

    @Lazy
    @Autowired
    private UserDetailsService userDetailsService;

    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHead}")
    private String tokenHead;


    /**
     * 登录后返回 token
     *
     * @param username
     * @param password
     * @param request
     * @return
     */
    @Override
    public RespBean login(String username, String password, HttpServletRequest request) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (userDetails == null || !passwordEncoder.matches(password, userDetails.getPassword())) {
            return RespBean.error("用户名或密码不正确");
        }
        if (!userDetails.isEnabled()) {
            return RespBean.error("账号被禁用，请聊系管理员");
        }
        // 可以用 security 提供的对象进行用户登录
        // 将登录成功地对象方向 security 的全文中
        // 更新 security 用户对象
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,
                null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        // 生成 token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return RespBean.success("登录成功", tokenMap);
    }

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    public TAdmin getAdminUserName(String username) {
        return adminMapper.selectOne(new QueryWrapper<TAdmin>().eq("username", username).
                eq("enabled", true));
    }

}
