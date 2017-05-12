package com.jiuwenxuan.wenbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuwenxuan.wenbo.dao.TreasureMapper;
import com.jiuwenxuan.wenbo.service.ITreasureService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author zcc
 * @data 2017年5月12日 下午5:30:56
 */
@Service
public class TreasureServiceImpl implements ITreasureService{
	@Autowired
	private TreasureMapper treasureDao;
}
