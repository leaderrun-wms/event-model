package com.leaderrun.eventmodel.asn.v1.car;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarInfo {

	String id;
	String licensePlateNo; // 车牌
	String driverName;
	String truckType; // 车型
	String driverMobile;

	String driverIdCard; // 司机身份证
	String carBodyWeight; // 车体自重
	String carFrameWeight; // 车架重
	String carHeaderWeight; // 车头重
	String cabinetWeight; // 柜重
	String carFrameNo; // 车架号码
	String containerNo; // 集装箱号
}
