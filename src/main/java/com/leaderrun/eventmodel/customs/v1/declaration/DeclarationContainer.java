package com.leaderrun.eventmodel.customs.v1.declaration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarationContainer {

	final String seq;
	// ID 
	final String type;
	// 集装箱号
	final String number;
	// 规格
	final String spec;
	
}
