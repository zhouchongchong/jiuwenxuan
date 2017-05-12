package com.jiuwenxuan.wenbo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiuwenxuan.wenbo.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private IUserService userService;
	
}
