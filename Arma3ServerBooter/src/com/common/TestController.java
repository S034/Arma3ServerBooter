package com.common;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.Entity.TestUser;
import com.common.service.UserService;

@Controller
public class TestController {
	
	  @Autowired
	    UserService userService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("dsadas");
        //����return��test��SpringMVC����������õ�ǰ׺��׺ȥ��ҳ��
        return "test";
    }
    
    @RequestMapping("/doLogin")
    public String doLogin(TestUser user){
        TestUser testUser = userService.getUser(user);
        if(testUser!=null){
            System.out.println(testUser.getPhone());
            return "success";
        }else{
            return "false";
        }
    }
}