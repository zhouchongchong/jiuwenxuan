package com.jiuwenxuan.wenbo.dao;

import com.jiuwenxuan.wenbo.domain.Dybasty;

public interface DynastyMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Dybasty record);

    int insertSelective(Dybasty record);

    Dybasty selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Dybasty record);

    int updateByPrimaryKey(Dybasty record);
}