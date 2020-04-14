package com.crawler.core.dao.sogou;

import com.crawler.common.domain.po.sogou.WeiyiOrganInfo;

public interface WeiyiOrganInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WeiyiOrganInfo record);

    int insertSelective(WeiyiOrganInfo record);

    WeiyiOrganInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WeiyiOrganInfo record);

    int updateByPrimaryKey(WeiyiOrganInfo record);
}