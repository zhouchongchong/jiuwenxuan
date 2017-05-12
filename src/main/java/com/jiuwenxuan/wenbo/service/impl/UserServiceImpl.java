package com.jiuwenxuan.wenbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuwenxuan.wenbo.dao.UserMapper;
import com.jiuwenxuan.wenbo.service.IUserService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author zcc
 * @data 2017年5月12日 下午5:26:44
 */
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userDao;

}
