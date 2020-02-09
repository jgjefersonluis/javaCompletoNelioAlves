package rh;

public class OutsourcedEmployee extends Employee {

	private double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
