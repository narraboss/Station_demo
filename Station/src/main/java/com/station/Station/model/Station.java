package com.station.Station.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Station {
	@Getter @Setter
	private String stationID;
	private String name;
	private boolean hdEnabled;
	private String callSign;
}
