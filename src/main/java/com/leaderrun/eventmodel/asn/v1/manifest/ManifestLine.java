package com.leaderrun.eventmodel.asn.v1.manifest;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.leaderrun.eventmodel.common.v1.KeyValue;
import com.leaderrun.eventmodel.common.v1.Volume;
import com.leaderrun.eventmodel.common.v1.Weight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 注：备品不参与报关和关务行总量计算，只需要体现在报关单表头的重量里面
 * 
 * 2020/3/30 增加清单锚点，对碰关务库存的锚点
 * 
 * @author kmtong
 *
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ManifestLine {

	final String id;
	final int lineNo;
	final SKUItem sku;
	final BigDecimal qty;
	final String unit;
	final Weight nw;
	final Weight gw;
	final Volume volume;
	final List<KeyValue> properties;
	final boolean spare; // 是否备品

	/**
	 * 使用哪一个单位作为锚点用来对碰关务库存（0=qty，1=nw）
	 */
	final int anchor;

}
