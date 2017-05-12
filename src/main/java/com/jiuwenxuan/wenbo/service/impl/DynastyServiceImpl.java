package com.jiuwenxuan.wenbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuwenxuan.wenbo.dao.DynastyMapper;
import com.jiuwenxuan.wenbo.service.IDynastyService;
@Service
public class DynastyServiceImpl implements IDynastyService {
	@Autowired
	private DynastyMapper dynastyDao;
}
