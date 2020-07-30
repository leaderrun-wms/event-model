package com.leaderrun.eventmodel.asn.v1;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

/**
 * ASN到达仓库
 * 
 * @author kmtong
 *
 */
@Data
@Builder(toBuilder = true)
public class ASNArrived {

	final public static String VERSION = "1.0";

	final String asn; // ASN号码 ASN2006001234
	final String warehouseCode; // 仓库代码 PLA
	final String processId; // 工单号 IPLA200602467
	final Date arrivedAt; // 到达时间 1592982477000
}
