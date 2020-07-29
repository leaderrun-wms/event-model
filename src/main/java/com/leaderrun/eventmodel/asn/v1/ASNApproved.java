package com.leaderrun.eventmodel.asn.v1;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * ASN审核通过
 * 
 * @author kmtong
 *
 */
@Data
public class ASNApproved {
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
