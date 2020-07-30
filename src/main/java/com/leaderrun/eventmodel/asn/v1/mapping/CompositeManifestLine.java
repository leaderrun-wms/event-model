package com.leaderrun.eventmodel.asn.v1.mapping;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Composition will generate a virtual manifest line, e.g.
 * 
 * <pre>
 *  1 x Table = 1 x Surface + 4 x Legs
 * </pre>
 * 
 * @author kmtong
 *
 */
@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class CompositeManifestLine {

	final String id;
	final BigDecimal qty;
	final List<LineQtySpec> components;

}
