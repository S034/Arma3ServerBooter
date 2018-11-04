package com.common.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.common.Entity.TestUser;
import com.common.service.UserService;

@Controller
public class TestController {
	
	@Autowired
	UserService userService;

    @RequestMapping("/test")
    public String test(){
        //这里return了test，SpringMVC会加上你配置的前缀后缀去找页面
        return "test";
    }
    
    @RequestMapping("/doLogin")
    public String doLogin(TestUser user){
        TestUser testUser = userService.getUser(user);
        if(testUser!=null){
            return "success";
        }else{
            return "false";
        }
    }
    
    @RequestMapping("/passWord")
    public @ResponseBody void passWord(HttpServletRequest request,HttpServletResponse response){
    	String old = request.getParameter("old");
    	String current = request.getParameter("current");
    	userService.passWord(old,current);
    }
    
    @RequestMapping("/getGeneral")
    public @ResponseBody void getGeneral(HttpServletRequest request,HttpServletResponse response){
    	String serverFile = request.getParameter("serverFile");
    	String Extra = request.getParameter("Extra");
    	userService.getGeneral(serverFile,Extra);
    }
    
    @RequestMapping("/getDetails")
    public @ResponseBody void getDetails(HttpServletRequest request,HttpServletResponse response){
    	String serverName = request.getParameter("serverName");
    	String password = request.getParameter("password");
    	String adminPassword = request.getParameter("adminPassword");
    	String port = request.getParameter("port");
    	String maxPlayers = request.getParameter("maxPlayers");
    	String VoN = request.getParameter("VoN");
    	userService.getDetails(serverName,password,adminPassword,port,maxPlayers,VoN);
    }
}