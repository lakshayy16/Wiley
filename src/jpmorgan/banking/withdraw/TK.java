package jpmorgan.banking.withdraw;
import java.util.*;
public class TK {
	
		String n = "";
		String id = "";
		void TK()
		{
			System.out.println(n+" "+id);
		}
		void m1(Scanner sc)
		{
			System.out.println("Enter the name:");
			n = sc.next();
			System.out.println("Enter the ID:");
			id = sc.next();		
			TK();
		}
		public static void main(String args[])
		{
			TK obj = new TK();
			Scanner sc = new Scanner(System.in);
			obj.m1(sc);
		}
	}
