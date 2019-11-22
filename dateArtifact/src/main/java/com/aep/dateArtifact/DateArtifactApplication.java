package com.aep.dateArtifact;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateArtifactApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DateArtifactApplication.class, args);

		DateImpl dateImpl = new DateImpl(new StringToDateImpl());

		dateImpl.callingStringToDate();

	}

}
