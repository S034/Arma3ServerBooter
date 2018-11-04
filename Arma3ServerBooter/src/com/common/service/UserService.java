package com.common.service;

import com.common.Entity.TestUser;

public interface UserService {

    TestUser getUser(TestUser user);

	public void passWord(String old,String current);

	public void getGeneral(String serverFile, String extra);

	public void getDetails(String serverName, String password, String adminPassword, String port, String maxPlayers,String voN);
    
}