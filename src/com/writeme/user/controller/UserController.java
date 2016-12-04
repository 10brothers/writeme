package com.writeme.user.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.writeme.system.utils.ServiceException;
import com.writeme.user.domain.UserAccount;
import com.writeme.user.service.UserServiceInterface;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	private UserServiceInterface userService;
	
	private Logger logger = Logger.getLogger(this.getClass());
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(UserAccount userAccount) throws ServiceException{
		try {
			userService.addUser(userAccount);
//			return "redirect:/user/registerResult";
			logger.debug("success");
			return "{'result':'success'}";
		} catch(Exception e1){
			logger.error("控制层发生错误",e1);
			throw new ServiceException(e1,"系统发生不明错误！");
		}
		
	}
}
