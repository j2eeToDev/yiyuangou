package org.yigou.persist;

import org.yigou.model.User;

public interface IUserDao {

	User findByUser(User user);
}
