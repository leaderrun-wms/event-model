package com.leaderrun.eventmodel.asn.v1.car;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {
	final CarInfo car;
	final Date eta; // 预计到仓时间
	final String etaInterval; // 预计到仓时间段
	final SendInfo sendInfo;
}
