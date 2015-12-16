package org.yigou.persist.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yigou.model.User;
import org.yigou.persist.IUserDao;
@Repository
public class UserDaoImpl implements IUserDao{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public User findByUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where userName=? and password=?");
		query.setString(0, user.getUserName());
		query.setString(1, user.getPassword());
		List<User> result = query.list();
		if(result.size()>0){
			return result.get(0);
		}
		return null;
	}

}
