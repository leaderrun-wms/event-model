package com.leaderrun.eventmodel.customs.v1.declaration;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Declaration {

	public final String id;
	/**
	 * 进口或出口报关（IMPORT/EXPORT）
	 */
	public final String type;
	/**
	 * 报关单表头
	 */
	public final DeclarationHeader header;
	/**
	 * 报关单表体
	 */
	public final List<DeclarationItem> details;
	/**
	 * 随附单证
	 */
	public final List<DeclarationControlDocument> controls;
	/**
	 * 附件
	 */
	public final List<DeclarationAttachment> attachments;
	/**
	 * 集装箱号
	 */
	public final List<DeclarationContainer> containers;

	public Boolean taxType;
	
	@JsonIgnore
	public String getDeclarationNo() {
		return getHeader() == null ? null : getHeader().getDeclarationNo();
	}
}
