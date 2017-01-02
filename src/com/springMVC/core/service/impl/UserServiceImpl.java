package com.springMVC.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springMVC.core.service.IUserService;
import com.springMVC.data.dao.IUserDao;
import com.springMVC.data.pojo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	
	public static void main(String[] args) {
		UserServiceImpl usi = new UserServiceImpl();
		usi.userDao.selectByPrimaryKey(1);
	}

}
