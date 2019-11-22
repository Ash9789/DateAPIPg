package com.aep.dateArtifact;

import org.springframework.stereotype.Component;

@Component
//This class considered as bean
public class DateImpl {

	private DateFormat dateFormat;

	public DateImpl(DateFormat dateFormat) {
		super();
		this.dateFormat = dateFormat;
	}

	void callingStringToDate() {
		dateFormat.stringToDateMethod();
	}

}
