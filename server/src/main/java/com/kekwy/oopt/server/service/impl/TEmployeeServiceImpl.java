package com.kekwy.oopt.server.service.impl;

import com.kekwy.oopt.server.mapper.TEmployeeMapper;
import com.kekwy.oopt.server.pojo.TEmployee;
import com.kekwy.oopt.server.service.ITEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kekwy
 * @since 2023-03-23
 */
@Service
public class TEmployeeServiceImpl extends ServiceImpl<TEmployeeMapper, TEmployee> implements ITEmployeeService {

}
