package absract;

public class LoanAccount extends BankAccount{

	public LoanAccount(int id, float balance) {
		super(id, balance);
	}

	public float CalculateInterest() {

		return (balance * 0.1f);
	}
}
