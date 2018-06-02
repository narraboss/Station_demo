package com.station.Station;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.station.Station.model.Station;

@SpringBootApplication
public class StationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationApplication.class, args);
		
		Station s=  new Station();
		
	}
}
