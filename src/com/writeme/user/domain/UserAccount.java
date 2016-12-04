package com.writeme.user.domain;

import java.sql.Date;

public class UserAccount {
	/**
	 * 用户的id  自动生成
	 */
    private Integer userID;
    
    /**
     * 用户昵称，作为登录名使用 ，唯一
     */
    private String nickName;

    /**
     * 密码，使用md5加密后存储
     */
    private String password;

    /**
     * 与用户相关联的邮箱，用于激活注册账号和找回用户名密码等
     */
    private String email;

    /**
     * 用户注册时的地址 ，后期可管理修改
     */
    private String address;

    /**
     * 用户生日信息
     */
    private Date birthDay;

    /**
     * 用户注册的日期时间
     */
    private Date registerTime;

    /**
     * 用户最近一次登录的IP地址
     */
    private String lastIP;

    /**
     * 用户账号的状态，0为未激活，1为激活状态
     */
    private Integer accountStat;

    /**
     * 用户分组 0是管理员，1是普通用户
     */
    private Integer userFlag;
    
    /**
     * 用户上次登录的时间 
     */
    private Date lastLoginTime;
    
    private Integer gender;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getLastIP() {
		return lastIP;
	}

	public void setLastIP(String lastIP) {
		this.lastIP = lastIP;
	}

	public Integer getAccountStat() {
		return accountStat;
	}

	public void setAccountStat(Integer accountStat) {
		this.accountStat = accountStat;
	}

	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	

}