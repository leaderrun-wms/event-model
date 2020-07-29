package com.leaderrun.eventmodel.customs.v1;

import java.util.Date;

import com.leaderrun.eventmodel.asn.v1.Declaration;

import lombok.Data;

/**
 * 已申报海
 * 
 * @author kmtong
 *
 */
@Data
public class CustomsDeclared {

	final String declarationId; // 报关单系统唯一号码 UUID
	final String warehouseCode; // 仓库代码 PLA
	final String refNo; // 关联号码 (ASN或出库单号) ASN2006001234
	final String refType; // 关联单证类型 ASN
	final Date declaredAt; // 申报时间 1592982477000
	final Declaration declaration; // 申报内容

}
