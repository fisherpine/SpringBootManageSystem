package com.ggbz.sys.service.impl;

import com.ggbz.sys.entity.User;
import com.ggbz.sys.mapper.UserMapper;
import com.ggbz.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ggbz
 * @since 2023-06-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
