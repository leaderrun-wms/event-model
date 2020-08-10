package com.leaderrun.eventmodel.asn.v1.car;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendInfo {
	final String appId; // 公众号Id
	final String unionId; 
	final String openId;
	final List<String> formIds;
}
