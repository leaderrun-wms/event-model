package com.leaderrun.eventmodel.common.v1;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Volume {

	final BigDecimal length;
	final BigDecimal width;
	final BigDecimal height;

	final String unit;

	public static Volume tranfer(BigDecimal length, BigDecimal width, BigDecimal height, String unit) {
		return (unit != null && !unit.isEmpty()) ? new Volume(length, width, height, unit) : null;
	}
}
