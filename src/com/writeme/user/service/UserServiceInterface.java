package com.writeme.user.service;

import com.writeme.system.utils.ServiceException;
import com.writeme.user.domain.UserAccount;

public interface UserServiceInterface {
	
	public void addUser(UserAccount user) throws ServiceException;
}
