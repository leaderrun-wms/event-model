package com.leaderrun.eventmodel.customs.v1.declaration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeclarationControlDocument {

	final String code;
	final String number;
	final String resourceId;
	public String getCode() {
		return code;
	}
	public String getNumber() {
		return number;
	}
	public String getResourceId() {
		return resourceId;
	}

}
