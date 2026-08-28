package bank;

public class Bank {

	
	//1. 필드
	
	private int money;
	
	
	
	
	
	//2. 입금 메서드
	public void deposit(int money) {
		this.money += money;
	}
	
	//3. 출금 메서드
	public void withdraw(int money) {
		// 만약에 출금할 돈이 부족하면 "잔액이 부족합니다"
		
		if(money <= this.money) {
			this.money -= money;
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
	
	//4. 잔액조회(showMoney)
	public int showMoney() {
		return money;
	}
	
	
	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	

	

	
	
	
	
	
	
	
}
