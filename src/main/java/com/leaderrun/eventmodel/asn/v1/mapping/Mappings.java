package com.leaderrun.eventmodel.asn.v1.mapping;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 清单和关务关系，包括：
 * 
 * <ul>
 * <li>组合
 * <li>清单行和关务行关系
 * <li>使用分组
 * </li>
 * 
 * @author kmtong
 *
 */
@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Mappings {

	final List<CompositeManifestLine> composites;
	final List<ManifestDecMapping> mappings;
	final List<UsageGroup> usageGroups;
	
}
