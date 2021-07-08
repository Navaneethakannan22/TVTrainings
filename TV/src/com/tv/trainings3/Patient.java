package com.tv.trainings3;

import java.time.LocalDate;

public class Patient {
	private String name;
	private String patientFrom;
	private LocalDate visitedDate;

	public Patient(String name, String patientFrom, LocalDate visitedDate) {
		this.name = name;
		this.patientFrom = patientFrom;
		this.visitedDate = visitedDate;
	}

	public String getName() {
		return name;
	}

	public String getPatientFrom() {
		return patientFrom;
	}

	public LocalDate getVisitedDate() {
		return visitedDate;
	}

	@Override
	public String toString() {
		return getName() + " from " + getPatientFrom();
	}
}
