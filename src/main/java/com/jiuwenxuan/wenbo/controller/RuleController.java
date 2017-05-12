package com.jiuwenxuan.wenbo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiuwenxuan.wenbo.service.IRuleService;

@Controller
@RequestMapping("/rule")
public class RuleController {
	@Resource
	private IRuleService ruleService;
	
}
