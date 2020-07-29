package com.leaderrun.eventmodel.so.v1;

import java.util.Date;

import lombok.Data;

/**
 * 从货代收到一个SO同步报文
 * 
 * @author kmtong
 *
 */
@Data
public class SOReceived {

	final String customerCode;
	final String so;
	final Date receivedAt;
	final byte[] raw;

}
