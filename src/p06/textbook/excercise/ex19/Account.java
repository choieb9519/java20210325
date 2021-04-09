package p06.textbook.excercise.ex19;

public class Account {
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1_000_000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= 0 || balance <= 1_000_000) {
			this.balance = balance;
		}
	}
}

