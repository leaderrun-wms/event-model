package com.leaderrun.eventmodel.asn.v1.mapping;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class UsageGroup {

	// manifest line id
	final String id;

	// consumption sequence
	final int usageGroup;

	final BigDecimal qty;

}
