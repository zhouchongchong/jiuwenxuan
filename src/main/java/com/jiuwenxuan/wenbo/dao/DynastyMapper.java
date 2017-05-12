package com.jiuwenxuan.wenbo.dao;

import com.jiuwenxuan.wenbo.domain.Dynasty;

public interface DynastyMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Dynasty record);

    int insertSelective(Dynasty record);

    Dynasty selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Dynasty record);

    int updateByPrimaryKey(Dynasty record);
}