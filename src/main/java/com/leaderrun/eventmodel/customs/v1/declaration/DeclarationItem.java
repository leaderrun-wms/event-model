package com.leaderrun.eventmodel.customs.v1.declaration;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leaderrun.eventmodel.common.v1.KeyValue;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarationItem {

	Integer lineNo;
	RegistryItemIdentifier registry;

	// Customs
	String hsCode;
	// 商检编码
	String ciCode;
	String name;
	String spec;

	String salesUnit;
	BigDecimal salesUnitQty;
	String unit1;
	BigDecimal unit1Qty;
	String unit2;
	BigDecimal unit2Qty;

	BigDecimal unitPrice;
	BigDecimal totalPrice;
	BigDecimal netWeight; // Unit Net Weight * Quantity in KG
	String currency;
	String control;
	String levy;
	/**
	 * 最终目的国
	 */
	String destinationCountry;
	/**
	 * 原产国
	 */
	String originCountry;
	/**
	 * 境内货源地
	 */
	String origin;

	/**
	 * 产地代码
	 */
	String sourceCode;

	/**
	 * 料件号
	 */
	String goodsNumber;
	/**
	 * 自定义属性
	 */
	List<KeyValue> properties;
	
	/**
	 * Anchor point for using which unit
	 */
	int anchor;
}
