package absract;

public class TestBankAccount {

	public static void main(String[] args) {
	
		CurrentAccount currentaccount=new CurrentAccount(1, 1000);
		SavingAccount savingaccount=new SavingAccount(2, 2000);
		LoanAccount loanaccount=new LoanAccount(3, 500);
		System.out.println("Current account balance is : "+currentaccount.CalculateInterest());
		System.out.println("Saving account balance is  : "+savingaccount.CalculateInterest());
		System.out.println("Loan account balance is    : "+loanaccount.CalculateInterest());

	}

}
