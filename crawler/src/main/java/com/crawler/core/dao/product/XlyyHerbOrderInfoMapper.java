package com.crawler.core.dao.product;

import com.crawler.common.domain.po.product.XlyyHerbOrderInfo;

public interface XlyyHerbOrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XlyyHerbOrderInfo record);

    int insertSelective(XlyyHerbOrderInfo record);

    XlyyHerbOrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XlyyHerbOrderInfo record);

    int updateByPrimaryKeyWithBLOBs(XlyyHerbOrderInfo record);

    int updateByPrimaryKey(XlyyHerbOrderInfo record);
}