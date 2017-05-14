package com.jiuwenxuan.wenbo.service;

import java.util.List;

import com.jiuwenxuan.wenbo.domain.Rule;

public interface IRuleService {
	
	public List<Rule> getRules();
	
	Rule getRule(Integer id);
}
