package com.leaderrun.eventmodel.asn.v1.mapping;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class ManifestDecMapping {

	final String mappingId;

	// global unique
	final String mfLineId;

	// dec id + dec line no (unique)
	final String decId;
	final int decLineNo;

	final MappingType type;
	// 当关务行关系重复的情况下，关务数量占比表示了关务数量（decBreakdown）是如何从清单组成的
	final BigDecimal decBreakdown;

	// 使用分组
	final int usageGroup;

}
