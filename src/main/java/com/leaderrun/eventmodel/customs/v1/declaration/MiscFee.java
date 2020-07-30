package com.leaderrun.eventmodel.customs.v1.declaration;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MiscFee {

	final String type;
	final BigDecimal value;
	final String currency;

}
