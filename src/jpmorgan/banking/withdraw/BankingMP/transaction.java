package jpmorgan.banking.withdraw.BankingMP;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class creditDebit extends Thread {
	static int totalBal = 0;
	static {
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(50, 5);
		hm.put(100, 5);
		hm.put(200, 4);
		hm.put(500, 3); //200 (50*4)(100*2)()

		for (int i : hm.keySet()) {
			totalBal += i * hm.get(i);
		}
		System.out.println(totalBal);

	}
	User u;

	public creditDebit(User u) {
		this.u = u;
	}

	public void run() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Credit/Debit(c/d)");
		Character ch = scn.nextLine().charAt(0);

		if (ch == 'c') {

		} else {
			System.out.println("Enter account-");
			int acId = scn.nextInt();
			for (Account a : u.accounts) {
				if (a.getAccId() == acId) {
					System.out.println(a.getBalance());
					System.out.println("Enter amount-");
					int amt = scn.nextInt();
					if (amt < a.getBalance() && amt < totalBal) {

					}
				}
			}

		}
	}
}

public class transaction {

	public static void main(String[] args) {

		Account a1 = new Account(1, 1, 1000);
		Account a2 = new Account(2, 1, 2000);
		List<Account> arr = Arrays.asList(a1, a2);
		User u1 = new User(1, "A");
		u1.setAccounts(arr);

		Account a3 = new Account(3, 2, 3000);
		List<Account> ar = Arrays.asList(a3);
		User u2 = new User(2, "B");
		u2.setAccounts(ar);

		creditDebit t1 = new creditDebit(u1);
		creditDebit t2 = new creditDebit(u2);
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
		}
		System.out.println(u1);
		System.out.println(u2);

	}
}
