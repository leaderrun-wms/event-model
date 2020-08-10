package com.leaderrun.eventmodel.customs.v1;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

/**
 * 海关查验
 * 
 * @author kmtong
 *
 */
@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomsInspection {

	final public static String TYPE = "customs.inspection";
	final public static String VERSION = "1.0";

	final String declarationId; // 报关单系统唯一号码 UUID
	final Date happenedAt; // 触发查验时间 1592982477000

}
