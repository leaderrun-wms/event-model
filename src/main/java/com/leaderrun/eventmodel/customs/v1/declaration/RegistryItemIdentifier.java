package com.leaderrun.eventmodel.customs.v1.declaration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

/**
 * 手册号+项号
 * 
 * @author kmtong
 *
 */
@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistryItemIdentifier {

	/**
	 * 手册号
	 */
	final String number;

	/**
	 * 手册项号
	 */
	final String seqNo;

	/**
	 * 版本号
	 */
	final String version;

}
