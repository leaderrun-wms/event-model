package com.leaderrun.eventmodel.asn.v1.mapping;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class LineQtySpec {

	final String lineId;
	final BigDecimal qty;

}
