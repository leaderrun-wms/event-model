package com.leaderrun.eventmodel.customs.v1;

import java.util.Date;

import lombok.Data;

/**
 * 海关已放行
 * 
 * @author kmtong
 *
 */
@Data
public class CustomsReleased {

	final String declarationId; // 报关单系统唯一号码 UUID
	final Date releasedAt; // 放行时间 1592982477000

}
