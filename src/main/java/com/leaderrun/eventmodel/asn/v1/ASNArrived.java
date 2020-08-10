package com.leaderrun.eventmodel.asn.v1;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leaderrun.eventmodel.asn.v1.car.Car;
import com.leaderrun.eventmodel.asn.v1.manifest.ManifestLine;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ASNArrived {

	final public static String TYPE = "asn.arrived";
	final public static String VERSION = "1.0";

	final String asn; // ASN号码 ASN2006001234
	final String warehouseCode; // 仓库代码 PLA
	final String processId; // 工单号 IPLA200602467
	final Date arrivedAt; // 到达时间 1592982477000

	// something may change
	final String customerCode; // 客户代码 KH0001
	final String childCustomerCode; // 子客代码 KN-ACCO

	final List<ManifestLine> manifest; // 货物清单（接单时有可能更新了SO/PO/ITEM）

	// car information
	final List<Car> cars;

}
