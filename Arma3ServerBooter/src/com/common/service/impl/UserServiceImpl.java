package com.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.Entity.TestUser;
import com.common.dao.TestUserDao;
import com.common.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    TestUserDao testUserDao;
    
    @Override
    public TestUser getUser(TestUser user) {
        // TODO Auto-generated method stub
        return testUserDao.getUser(user);
    }

}