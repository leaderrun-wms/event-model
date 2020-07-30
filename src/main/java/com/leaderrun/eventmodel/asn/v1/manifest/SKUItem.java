package com.leaderrun.eventmodel.asn.v1.manifest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SKUItem {
	final long id;
	final String code;
	final String name;
	final long corpId;
}