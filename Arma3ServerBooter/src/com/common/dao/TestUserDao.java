package com.common.dao;

import java.util.Map;
import com.common.Entity.TestUser;

public interface TestUserDao {
    
	TestUser getUser(TestUser user);

	public void passWord(Map<String,Object> params);

	public void serverFile(Map<String, Object> params);
	
	public void extra(Map<String, Object> params);

	public void getDetails(Map<String, Object> params);
}