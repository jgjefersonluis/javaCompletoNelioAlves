package fixacao2.entities;

public class BusinessAccount extends Account {

	private Object loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return (Double) loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	/*
	 * public void loan(double amount) { if (amount <= loanLimit) { ### Não aceita o
	 * montant menos o limit balance += amount - 10.0; } }
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
