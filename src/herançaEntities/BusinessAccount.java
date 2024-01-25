package herançaEntities;

public class BusinessAccount extends Account {
	private double loanLimit;

	public BusinessAccount() {

	}

	public BusinessAccount(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getloanLimit() {
		return loanLimit;
	}

	public void setloanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

}
