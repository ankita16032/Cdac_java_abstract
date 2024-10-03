package absract;


	abstract class BankAccount {
		protected int id;
		protected float balance;
		abstract public float CalculateInterest();
		
		public BankAccount(int id, float balance) {
			super();
			this.id = id;
			this.balance = balance;
		}
}
