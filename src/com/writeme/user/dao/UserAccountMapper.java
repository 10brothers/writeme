package com.writeme.user.dao;

import org.springframework.stereotype.Repository;

import com.writeme.system.utils.DaoException;
import com.writeme.user.domain.UserAccount;
@Repository
public interface UserAccountMapper {
    /**
     * 统计用户表中的用户量
     */
    long countUsers(UserAccount user) throws DaoException;

    /**
     * 向表中新增一条记录，返回新增记录的主键值
     */
    int insertNewUser(UserAccount record) throws DaoException;


    /**
     * 通过昵称查找具体的某一个用户
     */
    UserAccount selectByNickName(String nickName) throws DaoException;
    
    /**
     * 通过userID来查找用户
     */
    UserAccount selectByUserID(String userID) throws DaoException;

    /**
     * 更新多个字段，或者更新单个字段也可，使用动态sql
     */
    int updateMultiField(UserAccount record) throws DaoException;

}