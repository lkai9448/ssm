package com.mims.sys.service;

import com.mims.sys.vos.UserVO;

public interface UserService {

	public UserVO login(String username, String password);
	
	public void saveUser(UserVO userVO);
}
