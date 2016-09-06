package com.mims.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mims.sys.mapper.UserMapper;
import com.mims.sys.service.UserService;
import com.mims.sys.vos.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserVO login(String username, String password) {
		return userMapper.login(username, password);
	}

	@Override
	public void saveUser(UserVO userVO) {
		
	}

}
