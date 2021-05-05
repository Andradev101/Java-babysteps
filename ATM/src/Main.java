class Account {
	
	int num;
	double value;
	String name;
	int agency;
	
	void deposit(double DepositValue){
		this.value = value + DepositValue;
	}

	void withdraw(double WithdrawValue){
		System.out.println("Withdrawing: " + value + " - " + WithdrawValue + " and taxes!");
		double taxes;
		taxes = 0;
		
		if(value >= WithdrawValue) {
			this.value = value - WithdrawValue - taxes;
		} else {
			System.out.println("Impossible withdraw");
		}
	}
	
	void transfer(double transferValue, Account dest) {
		this.value -= transferValue;
		dest.value += transferValue;
	}
}


public class Main {

	public static void main(String[] args) {
		Account owner = new Account(); 
			//owner = nova classe Conta, que aponta para Conta
		owner.num = 966;
		owner.value = 1000.0;
		owner.name = "SomeName";
		owner.agency = 260;

		Account owner1 = new Account();
			//owner1 = nova conta que aponta para classe com assinatura Conta
		owner1.num= 567;
		owner1.value = 1500;
		owner.name = "Ozea";
		owner.agency = 260;
		
		System.out.println("*****operacoes*****");
		
		System.out.println("0 BEFORE DEPOSIT "+owner.value);
		owner.deposit(400);
		System.out.println("0 AFTER DEPOSIT "+owner.value+"\n");
		
		System.out.println("1 BEFORE WITHDRAW "+owner1.value);
		owner1.withdraw(500);
		System.out.println("1 AFTER WITHDRAW "+owner1.value+"\n");
		
		System.out.println("0 BEFORE TRANSFER "+owner.value);
		System.out.println("1 BEFORE TRANSFER "+owner1.value+"\n");
		owner1.transfer(300, owner);
		System.out.println("0 AFTER TRANSFER "+owner.value);
		System.out.println("1 AFTER TRANSFER "+owner1.value);
	}

}
