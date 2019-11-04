package com.java158.hrclient.controller;

import com.java158.hr.entity.Users;
import com.java158.hr.response.RestResponse;
import com.java158.hrclient.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

	@Autowired
	private UsersService usersService;

	@RequestMapping("/toLogin")
	public RestResponse hu(Users us, HttpSession session){
		System.out.println(us.getuName());
		Users users = usersService.findByName(us.getuName());
		if(users==null){
			// 账号错误
				return new RestResponse<>(500,"ERROR","账号错误");
		}else if (!users.getuPassword().equals(us.getuPassword())){
			// 密码错误
				return new RestResponse<>(500,"ERROR","密码错误");
		}
		//session.setAttribute("user", users);
		return new RestResponse<>(200,"SUCCESS","登录成功");
	}

}
