package com.leaderrun.eventmodel.customs.v1.declaration;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leaderrun.eventmodel.common.v1.KeyValue;

import lombok.Builder;
import lombok.Data;

@Builder(toBuilder = true)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarationHeader {

	/**
	 * 生产销售单位
	 */
	CustomsEntity businessEntity;

	/**
	 * 境内发货单位
	 */
	CustomsEntity importExportEntity;

	/**
	 * 申报单位
	 */
	CustomsEntity declarationEntity;

	/**
	 * 境外收货单位
	 */
	CustomsEntity overseasImportEntity;

	/**
	 * 贸易方式（监管方式）
	 */
	String tradeMode;
	/**
	 * 成交方式
	 */
	String transactionMode;
	/**
	 * 贸易国
	 */
	String tradeCountry;
	/**
	 * 运抵国
	 */
	String destinationCountry;
	/**
	 * 申报口岸
	 */
	String declarationPort;
	/**
	 * 进出口口岸
	 */
	String importExportPort;
	/**
	 * 运输方式
	 */
	String shipmentMethod;
	/**
	 * 运输工具
	 */
	String shipmentTool;
	/**
	 * 航次号
	 */
	String voyageNumber;
	/**
	 * 提运单号
	 */
	String shipmentNumber;
	/**
	 * 指运港
	 */
	String localPort;
	/**
	 * 境内货源地
	 */
	@Deprecated
	String origin;

	/**
	 * 离境口岸
	 */
	String leavePort;
	/**
	 * 征免性质
	 */
	String levyNature;
	/**
	 * 备案号
	 */
	String registryNumber;
	/**
	 * 合同号
	 */
	String contractNumber;

	/**
	 * 包装方式
	 */
	String packingType;
	/**
	 * 件数
	 */
	BigDecimal pieces;
	/**
	 * 毛重
	 */
	BigDecimal grossWeight; // in KG
	/**
	 * 净重
	 */
	BigDecimal netWeight; // in KG
	/**
	 * 特殊关系确认
	 */
	Boolean specialRelationship;
	/**
	 * 价格影响确认
	 */
	Boolean priceImpact;
	/**
	 * 支付特许权使用费确认
	 */
	Boolean paymentOfRoyalies;
	/**
	 * 备注
	 */
	String remark;
	/**
	 * 运费
	 */
	MiscFee transportFee;
	/**
	 * 保费
	 */
	MiscFee insuranceFee;
	/**
	 * 杂费
	 */
	MiscFee otherFee;
	/**
	 * 随附单证类别
	 */
	String control;
	/**
	 * 许可证号
	 */
	String licenseNumber;
	/**
	 * 进出口日期
	 */
	Date importExportDate;
	/**
	 * 申报日期（海关回执）
	 */
	Date declarationDate;
	/**
	 * 统一编号（海关回执）
	 */
	String receiptNo;
	/**
	 * 预录入编号（海关回执） 一般等于报关单号
	 */
	String inputNo;

	/**
	 * 海关编号（报关单号）（海关回执）
	 */
	String declarationNo;

	/**
	 * 表体征免
	 */
	@Deprecated
	String levy;

	/**
	 * 表体币制
	 */
	@Deprecated
	String currency;

	/**
	 * 电子委托 0 不使用电子委托 1 逐单委托 2 长期委托
	 */
	Integer etrustId;

	/**
	 * 电子委托 长期委托时显示的到期日期
	 */
	Date etrustExpDt;

	/**
	 * 电子委托 逐单委托时填写的单号
	 */
	String etrustNo;

	/**
	 * 自定义属性
	 */
	List<KeyValue> properties;
}
