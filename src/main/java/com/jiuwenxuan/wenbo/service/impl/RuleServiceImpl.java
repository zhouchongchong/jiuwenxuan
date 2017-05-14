package com.jiuwenxuan.wenbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuwenxuan.wenbo.dao.RuleMapper;
import com.jiuwenxuan.wenbo.domain.Rule;
import com.jiuwenxuan.wenbo.service.IRuleService;
@Service
public class RuleServiceImpl implements IRuleService {
	@Autowired
	private RuleMapper ruleDao;

	public List<Rule> getRules() {
		  
		// TODO Auto-generated method stub  
		return ruleDao.getRules();
	}

	public Rule getRule(Integer id) {
		  
		// TODO Auto-generated method stub  
		return ruleDao.selectByPrimaryKey(id);
	}
}
