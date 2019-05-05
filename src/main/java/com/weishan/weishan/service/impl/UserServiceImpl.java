package com.weishan.weishan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weishan.weishan.entity.User;
import com.weishan.weishan.dao.UserMapper;
import com.weishan.weishan.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
