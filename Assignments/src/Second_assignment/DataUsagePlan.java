package Second_assignment;

public class DataUsagePlan {
	private static int numOfPlans = 0;
	private String customerName;
	private String nationalID;
	private String planID;
	private char planType;
	private int usedGB;

	public DataUsagePlan(String name, String nationalID, char type, int usedGB) {
		this.customerName = name;
		this.nationalID = nationalID;
		this.planType = type;
		this.usedGB = usedGB;
		this.planID = generatePlanID();
		numOfPlans++;
	}

	private String generatePlanID() {
		char first = nationalID.charAt(0);
		char last = nationalID.charAt(nationalID.length() - 1);
		return "" + first + last + planType + numOfPlans;
	}

	public double calculateTotalCost() {
		if (planType == 'L') {
			if (usedGB <= 10)
				return 50.0;
			return 50.0 + (usedGB - 10) * 5.0;
		} else if (planType == 'S') {
			if (usedGB <= 50)
				return 100.0;
			return 100.0 + (usedGB - 50) * 3.0;
		} else {
			return 200.0;
		}
	}

	public static boolean isValidPlanType(char type) {
		return type == 'L' || type == 'S' || type == 'U';
	}

	public void displayInfo() {
		System.out.println("Name: " + customerName + ", National ID: " + nationalID + ", ID: " + planID + ", Type: "
				+ planType + ", Used GB: " + usedGB + ", Total cost: " + calculateTotalCost() + " SAR");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getPlanID() {
		return planID;
	}

	public char getPlanType() {
		return planType;
	}

	public void setPlanType(char planType) {
		this.planType = planType;
	}

	public int getUsedGB() {
		return usedGB;
	}

	public void setUsedGB(int usedGB) {
		this.usedGB = usedGB;
	}
}