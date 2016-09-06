package com.mims.sys.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mims.sys.vos.UserVO;

public interface UserMapper {

	@Select("select * from t_user where username=#{username} and password=#{password}")
	@Results({
		@Result(id=true, column="id", property="id", javaType=Integer.class),
		@Result(column="username", property="username", javaType=String.class),
		@Result(column="username", property="username", javaType=String.class)
	})
	public UserVO login(@Param("username") String username, @Param("password") String password);
}
