package org.yigou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yigou.model.User;
import org.yigou.persist.IUserDao;
import org.yigou.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Autowired
	IUserDao userDao;
	public User invalideUser(User user) {
		
		return userDao.findByUser(user);
	}

}
