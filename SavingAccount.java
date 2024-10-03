package absract;

public class SavingAccount extends BankAccount {

	public SavingAccount(int id, float balance) {
		super(id, balance);
	}

	public float CalculateInterest() {

		return (balance * 0.056f);
	}
}
