package nhs.management.system;

import java.util.List;

public class Hospital {

	private List <Doctor> doctor;
	private List <Patient> patient;
	
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	public Hospital(List<Doctor> doctor, List<Patient> patient) {
		super();
		totalMoneyEarned=0;
		totalMoneySpent=0;
		this.doctor = doctor;
		this.patient = patient;
	}

	
	public List<Doctor> getDoctor() {
		return doctor;
	}


	public void addDoctor(Doctor doctor) {
		this.doctor.add(doctor);
	}


	public List<Patient> getPatient() {
		return patient;
	}


	public void addPatient(Patient patient) {
		this.patient.add(patient);
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned = totalMoneyEarned+MoneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

		// salary of the docs is the money spent
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned = totalMoneyEarned-MoneySpent;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
