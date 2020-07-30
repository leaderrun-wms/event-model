package com.leaderrun.eventmodel.common.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Measurement {

	final Volume volume;
	final Weight gross;
	final Weight net;

}
