package com.tv.trainings3;

import java.time.LocalDate;
import java.time.Month;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CMHospitalTest {

	Patient p1, p2, p3, p4, p5, p6, p7, p8;
	ChinmayaMissionHospital cmh = new ChinmayaMissionHospital();

	@BeforeClass
	public void addPatientsData() {
		p1 = new Patient("Patient1", "Bangalore", LocalDate.of(2021, 7, 5));
		p2 = new Patient("Patient2", "Bangalore", LocalDate.of(2021, Month.JULY, 5));
		p3 = new Patient("Patient3", "Chennai", LocalDate.of(2021, 6, 15));
		p4 = new Patient("Patient4", "Andra", LocalDate.of(2021, 7, 4));
		p5 = new Patient("Patient5", "Delhi", LocalDate.of(2021, 7, 3));
		p6 = new Patient("Patient1", "Bangalore", LocalDate.of(2021, 7, 8));
		p7 = new Patient("Patient1", "Bangalore", LocalDate.of(2021, 7, 9));
		p8 = new Patient("Patient3", "Chennai", LocalDate.of(2021, 7, 5));

		cmh.addPatient(p1, p2, p3, p4, p5, p6, p7, p8);
		Reporter.log("Patients data were added", true);
		cmh.showAllPatients();
		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void decisionBasedOnPatientsData() {
		cmh.getDecisionNewBranchLocation();

		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void DisplayPatientListVisitedOnJuly5() {
		Reporter.log("Patients who visited on July 5th is: ");
		cmh.showPatientListVisitedOn("Bangalore", LocalDate.of(2021, 7, 5));

		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void DisplayPatientListVisitedFromJuly1To5() {
		Reporter.log("Patients who visited From July1 to July5th is: ");
		cmh.showPatientListVisitedBetween("Delhi", LocalDate.of(2021, 7, 1), LocalDate.of(2021, 7, 5));

		Reporter.log("=================================EOT======================================", true);
	}

	@Test
	public void validateLocalPatientsCount() {
		Assert.assertEquals(cmh.getLocalPatientsList().size(), 2);
		Reporter.log("Patients from Bangalore are: " + cmh.getLocalPatientsList().size());

		Reporter.log("=================================EOT======================================", true);
	}

//	@Test
//	public void validatePatientsCountOnJune() {
//		
//	}
//	@Test
//	public void validatePatientsCountOnFromOutsideBangalore() {
//		
//	}
}
