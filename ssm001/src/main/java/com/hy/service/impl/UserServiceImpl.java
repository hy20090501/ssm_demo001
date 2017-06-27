package com.hy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.dao.UserMapper;
import com.hy.domain.User;
import com.hy.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired  
	private UserMapper userMapper;
	
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
