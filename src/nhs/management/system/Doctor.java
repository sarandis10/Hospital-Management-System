package nhs.management.system;

public class Doctor {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Doctor(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
		this.salaryEarned=0;
		 
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void receiveSalary(int salary) {
		salaryEarned=salaryEarned+salary;
		Hospital.updateTotalMoneySpent(salaryEarned);
	}
	
	@Override
	public String toString() {
		return "Docs names is:"+name+" with total salary payed "+ salaryEarned;
	}

}
