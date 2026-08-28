package bank;

public class BankMain {

	public static void main(String[] args) {

		
		
		Bank b1 = new Bank();
		
		b1.deposit(10000);
		
		System.out.println(b1.getMoney());
		
		b1.deposit(10000);
		System.out.println(b1.getMoney());
		
		b1.withdraw(21000);
		System.out.println(b1.getMoney());
		
		b1.showMoney();
		System.out.println(b1.showMoney());
		
		
		
		
	}

}
