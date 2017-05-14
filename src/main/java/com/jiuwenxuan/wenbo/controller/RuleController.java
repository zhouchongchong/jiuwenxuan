package com.jiuwenxuan.wenbo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiuwenxuan.wenbo.domain.Rule;
import com.jiuwenxuan.wenbo.service.IRuleService;

@Controller
@RequestMapping("/rule")
public class RuleController {
	@Resource
	private IRuleService ruleService;
	@RequestMapping("getrules")
	@ResponseBody
	public List<Rule> getrules(){
		return ruleService.getRules();
	}
	@RequestMapping("getrule")
	@ResponseBody
	public Rule getRule(){
		return ruleService.getRule(1);
	}
}
