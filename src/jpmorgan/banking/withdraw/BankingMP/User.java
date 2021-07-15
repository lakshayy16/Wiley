package jpmorgan.banking.withdraw.BankingMP;
import java.util.List;

public class User {
	int id;
	String name;
	List<Account> accounts;
	
	User(int id,String name){
		this.id = id;
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", accounts=" + accounts + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}