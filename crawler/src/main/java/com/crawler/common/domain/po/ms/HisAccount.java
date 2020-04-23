package com.crawler.common.domain.po.ms;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class HisAccount {
	private Long id;

	private String accountId;

	private String uid;

	private Byte uidType;

	private String orderId;

	private Integer type;

	private BigDecimal money;

	private Integer timeGroup;

	private Byte status;

	private String accountDesc;

	private Date createTime;

	private Date updateTime;
}