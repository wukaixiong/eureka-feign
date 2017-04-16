package com.cart.eureka_feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eureka_feign.mapper.UserMapper;
import com.cart.eureka_feign.model.User;
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public User getUserInfo(){
		 User user=userMapper.findUserInfo();
		return user;
	}
}
