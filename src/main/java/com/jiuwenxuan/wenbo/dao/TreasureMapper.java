package com.jiuwenxuan.wenbo.dao;

import com.jiuwenxuan.wenbo.domain.Treasure;

public interface TreasureMapper {
    int deleteByPrimaryKey(Long tId);

    int insert(Treasure record);

    int insertSelective(Treasure record);

    Treasure selectByPrimaryKey(Long tId);

    int updateByPrimaryKeySelective(Treasure record);

    int updateByPrimaryKeyWithBLOBs(Treasure record);

    int updateByPrimaryKey(Treasure record);
}