package com.crawler.common.domain.po.product;

import lombok.Data;

import java.util.Date;

@Data
public class XlyyHerbOrderInfo {
	private Integer id;

	private String herbOrderId;

	private Byte herbOrderStatus;

	private String consultOrderId;

	private String diagnosisId;

	private String doctorId;

	private String patientId;

	private String pharmacyId;

	private String doctorName;

	private String doctorPhone;

	private String patientName;

	private String patientPhone;

	private Byte herbType;

	private String herbStates;

	private String orderPrice;

	private Integer orderNum;

	private String receiverName;

	private String receiverPhone;

	private Date payTime;

	private Date receiveTime;

	private Date packTime;

	private Date transTime;

	private Date deliveryTime;

	private Date signedTime;

	private Date insertTime;

	private Date updateTime;

	private Date orderCreateTime;

	private Boolean isWeixinUser;

	private String trackingNum;

	private Date opRemarkTime;

	private String postCompanyId;

	private String orderMoney;

	private String prescPrice;

	private String clinicRoyalties;

	private String expressFee;

	private String processFee;

	private String boilFee;

	private Byte hideWeight;

	private String diagnosisPrescPrice;

	private Byte expressState;

	private Byte patientType;

	private Byte isPush;

	private String opRemarker;

	private Integer followStatus;

	private String receiverAddress;

	private String opRemark;

	private String remark;

}