package com.leaderrun.eventmodel.customs.v1.declaration;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 收发货人、经营单位等结构
 * 
 * @author kmtong
 *
 */
@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomsEntity {

	/**
	 * System ID
	 */
	public final String id;

	/**
	 * 海关编号（10位字母+数字）
	 */
	public final String code;

	/**
	 * 统一社会信用代码（18位字母+数字）
	 */
	public final String unifiedCode;

	/**
	 * 企业名称
	 */
	public final String name;

	/**
	 * 合同地址
	 */
	public final String address;

	/**
	 * 合同电话
	 */
	public final String tel;

	/**
	 * 有效期到
	 */
	public final Date validUntil;

	/**
	 * Resource ID for the Chop (if any)
	 */
	public final String chop;

	public final EntityType type;
	public final String contactName;
	public final String mobile;
	public final String fax;
	public final String regCiqCode;
}
