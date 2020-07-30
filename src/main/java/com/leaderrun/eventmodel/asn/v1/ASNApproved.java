package com.leaderrun.eventmodel.asn.v1;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leaderrun.eventmodel.asn.v1.manifest.ManifestLine;
import com.leaderrun.eventmodel.asn.v1.mapping.Mappings;
import com.leaderrun.eventmodel.customs.v1.declaration.Declaration;

import lombok.Builder;
import lombok.Data;

/**
 * ASN审核通过
 * 
 * @author kmtong
 *
 */
@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ASNApproved {

	final public static String TYPE = "asn.approved";
	final public static String VERSION = "1.0";

	final String asn; // ASN号码 ASN2006001234
	final String customerCode; // 客户代码 KN
	final List<ManifestLine> manifest; // 货物清单
	final List<Declaration> declarations; // 报关单(可以多份)
	final Mappings mappings; // 清单和报关单关系
	final String submittedOrgId; // 提交公司ID 562
	final String submittedBy; // 提交公司名称 某某工厂
	final Date submittedAt; // 提审时间 1592972477000
	final String approver; // 审核人 陈大文
	final Date approvedAt; // 审核时间 1592982477000
}
