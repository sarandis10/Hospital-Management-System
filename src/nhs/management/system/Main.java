package nhs.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Doctor boss=new Doctor(1, "Boss", 500);
		Doctor maria=new Doctor(2, "Maria", 400);
		Doctor foufoutos=new Doctor(3, "Foufoutos", 230);
		
		List<Doctor> doctorList=new ArrayList<Doctor>();
		doctorList.add(boss);
		doctorList.add(maria);
		doctorList.add(foufoutos);
		
		
		Patient pat1= new Patient(1, "Pat1");
		Patient pat2= new Patient(2, "Pat2");
		Patient pat3= new Patient(3, "Pat3");
		
		List<Patient> patientList=new ArrayList<Patient>();
		patientList.add(pat1);
		patientList.add(pat2);
		patientList.add(pat3);
		
		Hospital nhs= new Hospital(doctorList, patientList);
		
		
		pat1.payFees(300);
		pat2.payFees(600);
		
		
		
		System.out.println("-------------Make NHS to pay a salary------------- ");
		maria.receiveSalary(maria.getSalary());
		foufoutos.receiveSalary(foufoutos.getSalary());
		System.out.println("nhs has earned £"+nhs.getTotalMoneyEarned());
		System.out.println(pat1);
		System.out.println(maria);
	}
	
	
	
	
	
	
	
	
	
	
	
}
