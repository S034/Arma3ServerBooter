package com.common.service.impl;

import java.util.HashMap;
import java.util.Map;

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

	@Override
	public void passWord(String old,String current) {
		// TODO Auto-generated method stub
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("old", old);
		params.put("current", current);
		testUserDao.passWord(params);
	}

	@Override
	public void getGeneral(String serverFile, String extra) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("serverFile", serverFile);
		Map<String, Object> params2 = new HashMap<String, Object>();
		params2.put("extra", extra);
		testUserDao.serverFile(params);
		testUserDao.extra(params2);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDetails(String serverName, String password, String adminPassword, String port, String maxPlayers,String voN) {
		// TODO Auto-generated method stub
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("serverName", serverName);
		params.put("password", password);
		params.put("adminPassword", adminPassword);
		params.put("port", port);
		params.put("maxPlayers", maxPlayers);
		params.put("voN", voN);
		testUserDao.getDetails(params);
	}

}