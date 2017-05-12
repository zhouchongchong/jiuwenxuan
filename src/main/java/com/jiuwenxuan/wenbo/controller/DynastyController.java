package com.jiuwenxuan.wenbo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiuwenxuan.wenbo.service.IDynastyService;

@Controller
@RequestMapping("/dynasty")
public class DynastyController {
	@Resource
	private IDynastyService dynastyService;

}
