package nhs.management.system;

public class Patient {
	private int id;
	private String name;
	private int feesPaid;
	private int feesTotal;
	
	public Patient(int id, String name) {
		super();
		feesPaid=0;
		feesTotal=500;
		this.id = id;
		this.name = name;
	}

	//id and name will be setted once by the constuctor
	
	 
	public void payFees(int fees) {
		feesPaid=fees+feesPaid;
		Hospital.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public double getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return  feesTotal-feesPaid;
	}

	@Override
	public String toString() {
		return "Patiet names is:"+name+" with total fees payed "+ feesPaid;
	}
	
	
	
	
	
	
	
}
