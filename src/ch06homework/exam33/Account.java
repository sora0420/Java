package ch06homework.exam33;
//Q19
public class Account {
	final static public int MIN_BALANCE = 0;
	final static public int MAX_BALANCE = 0;
	private int balance;

	public void setBalance(int balance) {
		if (balance > 0 && balance < 1000000) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return this.balance;
	}

}
