package com.tv.trainings3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChinmayaMissionHospital {
	private String hospitalLocation = "Bangalore";
	private List<Patient> patients;

	public ChinmayaMissionHospital() {
		patients = new ArrayList<>();
	}

	// To add Patient data
	public void addPatient(Patient... patients) {
		for (Patient patient : patients) {

			if (!this.patients.stream().anyMatch(pat -> (pat.getName().equalsIgnoreCase(patient.getName()))
					&& (pat.getPatientFrom().equalsIgnoreCase(patient.getPatientFrom()))))
				this.patients.add(patient);
		}

	}

	public void showAllPatients() {
		patients.stream().iterator().forEachRemaining(patient -> System.out.println(patient.toString()));
	}

	// To get local Patient
	public List<Patient> getLocalPatientsList() {
		List<Patient> localPatients = new ArrayList<>();
		localPatients = patients.stream().parallel()
				.filter(patient -> patient.getPatientFrom().equalsIgnoreCase(hospitalLocation))
				.collect(Collectors.toList());

		return localPatients;
	}

	// To get outside Patient
	public List<Patient> getOutsidePatientsList() {
		List<Patient> outPatients = new ArrayList<>();
		outPatients = patients.stream().parallel()
				.filter(patient -> !patient.getPatientFrom().equalsIgnoreCase(hospitalLocation))
				.collect(Collectors.toList());

		return outPatients;
	}

	public List<Patient> getPatientsListVisitedOn(String patientFrom, LocalDate visitedDate) {

		return patients.stream().filter(patient -> patient.getPatientFrom().equalsIgnoreCase(patientFrom)
				&& patient.getVisitedDate().equals(visitedDate)).collect(Collectors.toList());
	}

	public List<Patient> getPatientsListVisitedBetween(String patientFrom, LocalDate fromDate, LocalDate toDate) {

		return patients.stream()
				.filter(patient -> (patient.getPatientFrom().equalsIgnoreCase(patientFrom)
						&& patient.getVisitedDate().isAfter(fromDate.minusDays(1))
						&& patient.getVisitedDate().isBefore(toDate.plusDays(1))))
				.collect(Collectors.toList());

	}

	public void showPatientListVisitedOn(String patientFrom, LocalDate visitedDate) {
		List<Patient> patientVisitedList = getPatientsListVisitedOn(patientFrom, visitedDate);
		patientVisitedList.stream().iterator().forEachRemaining(patient -> System.out.println(patient.toString()));
	}

	public void showPatientListVisitedBetween(String patientFrom, LocalDate fromDate, LocalDate toDate) {
		List<Patient> patientVisitedList = getPatientsListVisitedBetween(patientFrom, fromDate, toDate);
		patientVisitedList.stream().iterator().forEachRemaining(patient -> System.out.println(patient.toString()));
	}

	public int getLocalPatientPercentage() {
		// return (getLocalPatientsList().size() * 100) / patients.size();
		return (80 * 100) / 100;
	}

	public int getOutPatientPercentage() {
		// return (getOutsidePatientsList().size() * 100) / patients.size();
		return (20 * 100) / 100;
	}

	public void getDecisionNewBranchLocation() {

		if (getLocalPatientPercentage() > 60)
			System.out.println("More than 60% of Patients are from " + hospitalLocation);
		else if (getOutPatientPercentage() > 60)
			System.out.println("More than 60% of Patients are from Outside of " + hospitalLocation);
		else
			System.out.println("Patients visit is from local and Outside is almost same");
	}
//	public Date getFormattedDate(String visitedOnDate) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		Calendar.getInstance().getTime();
//		Date date = sdf.parse(visitedOnDate);
//		return date;
//	}
}
