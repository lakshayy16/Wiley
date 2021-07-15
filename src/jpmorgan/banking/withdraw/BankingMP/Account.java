package jpmorgan.banking.withdraw.BankingMP;

public class Account {
	int accId;
	int userId;
	int balance;
	
	//branch1
	
	public Account(int accId, int userId, int balance) {
		this.accId = accId;
		this.userId = userId;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", userId=" + userId + ", balance=" + balance + "]";
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}