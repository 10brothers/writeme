package com.writeme.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.writeme.system.utils.DaoException;
import com.writeme.system.utils.EncodeByMD5;
import com.writeme.system.utils.ServiceException;
import com.writeme.user.dao.UserAccountMapper;
import com.writeme.user.domain.UserAccount;
import com.writeme.user.service.UserServiceInterface;

@Component("userService")
public class UserServiceIntfImpl implements UserServiceInterface {
	
	@Autowired
	private UserAccountMapper userAccount ;
	
	public void addUser(UserAccount user) throws ServiceException {
		try{
			String password = user.getPassword();
			user.setPassword(EncodeByMD5.getMD5String(password));
			userAccount.insertNewUser(user);
		}catch(DaoException se){
			throw new ServiceException(se,"数据访问层发生错误！"); 
		}
	}

}
