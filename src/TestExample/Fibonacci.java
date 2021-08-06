package TestExample;
import java.util.*;
public class Fibonacci {
	static long []dp;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print pattern upto ..");
		int n = sc.nextInt();
		dp = new long[n+1];
		dp[0]=1;
		long ans = fibonacci(n);
		System.out.print(ans);

	}
	
	static long fibonacci(int n)
	{
		if(n<=2)
			return n;
		if(dp[n]==0)
		{
			dp[n]= n*fibonacci(n-1);
			return dp[n];
		}
		else
			return dp[n];
	}
		
		
	}

