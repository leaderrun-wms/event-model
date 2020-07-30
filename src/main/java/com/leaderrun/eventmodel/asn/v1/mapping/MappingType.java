package com.leaderrun.eventmodel.asn.v1.mapping;

/**
 * 清单和关务行关系
 * 
 * @author kmtong
 *
 */
public enum MappingType {
	/**
	 * 拆分报关（汇总数量翻倍）
	 */
	SPLIT, //
	/**
	 * 归并报关（汇总数量不变）
	 */
	MERGE, //
	/**
	 * 组合报关（汇总数量改变了：组合成另一个报关商品）
	 * 
	 * @deprecated
	 * @see CompositeManifestLine
	 */
	COMBINE //
}
