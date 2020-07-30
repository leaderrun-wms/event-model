package com.leaderrun.eventmodel.common.v1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.Data;

@Data
public class Weight {

	public final BigDecimal weight;
	public final String unit;

	public static Weight create(BigDecimal weight, String unit) {
		return (unit != null && !unit.isEmpty()) && (weight != null) ? new Weight(weight, unit) : null;
	}

	public Weight subtract(BigDecimal value) {
		return new Weight(weight.subtract(value), unit);
	}

	public Weight add(BigDecimal value) {
		return new Weight(weight.add(value), unit);
	}

	public Weight divide(BigDecimal value, int scale, RoundingMode mode) {
		return new Weight(weight.divide(value, scale, mode), unit);
	}

	public Weight multiply(BigDecimal value) {
		return new Weight(weight.multiply(value), unit);
	}

	public Weight round(int scale, RoundingMode rounding) {
		return new Weight(weight.setScale(scale, rounding), unit);
	}
}
