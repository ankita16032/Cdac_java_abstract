package absract;

public class CurrentAccount extends BankAccount{
	public CurrentAccount(int id,float balance) {
		super(id,balance);
	}
		
		public float CalculateInterest() {
			
			return (balance*0.07f);
		}
}
