package com.leaderrun.eventmodel.common.v1;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.Data;

@Data
public class KeyValue {
	final public String key;
	
	@JsonTypeInfo(use = Id.CLASS, include = As.PROPERTY, property = "class", defaultImpl = Map.class)
	final public Object value;

}
