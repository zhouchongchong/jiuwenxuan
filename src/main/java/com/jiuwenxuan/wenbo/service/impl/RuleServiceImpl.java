package com.jiuwenxuan.wenbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuwenxuan.wenbo.dao.RuleMapper;
import com.jiuwenxuan.wenbo.service.IRuleService;
@Service
public class RuleServiceImpl implements IRuleService {
	@Autowired
	private RuleMapper ruleDao;
}
