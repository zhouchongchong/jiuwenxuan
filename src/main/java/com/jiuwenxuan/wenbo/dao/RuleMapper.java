package com.jiuwenxuan.wenbo.dao;

import com.jiuwenxuan.wenbo.domain.Rule;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Rule record);

    int insertSelective(Rule record);

    Rule selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);
}