package jpmorgan.banking.withdraw;
import java.util.*;
public class random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strn= "";
		int c=0;
		for(int i =0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				System.out.print(str.charAt(i)+"*");
				//c++;
				//strn=str.substring(0, i)+"*"+str.subSequence(i,str.length());
				//System.out.print(strn.substring(old, i+1));
				//old=i;
			}
			System.out.print(str.charAt(i+1));
			
		}
		

	}
	// Recursive Java program to insert * between
	// two consecutive same characters.
//
//	static String output="";
//
//	// Function to insert * at desired position
//	static void pairStar(String input,int i)
//	{
//		// Append current character
//		output = output + input.charAt(i);
//
//		// If we reached last character
//		if (i == input.length() - 1)
//			return;
//
//		// If next character is same,
//		// append '*'
//		if (input.charAt(i) == input.charAt(i+1))
//			output = output + '*';	
//
//		pairStar(input, i+1);
//	}
//
//	// Driver code
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		pairStar(input,0);
//		System.out.println(output);
//	}
}