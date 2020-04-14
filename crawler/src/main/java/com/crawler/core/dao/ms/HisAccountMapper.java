package com.crawler.core.dao.ms;

import com.crawler.common.domain.po.ms.HisAccount;

public interface HisAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HisAccount record);

    int insertSelective(HisAccount record);

    HisAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HisAccount record);

    int updateByPrimaryKey(HisAccount record);
}