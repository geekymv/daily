package com.geekymv.daily.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geekymv.daily.core.pojo.User;

@RestController
public class UserController {

	@RequestMapping("/login")
	@ResponseBody
	public User login() {
		User user = new User();
		user.setAccount("miying");
		return user;
	}

}
