package TestExample;

import java.util.*;

public class monk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		String str[]=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
			
		}
		for(int i=0;i<n;i++)
		{
		arr[i][0]=str[i].charAt(0);
		arr[i][1]=str[i].charAt(2);
		}
		for(int j=0;j<n;j++) {
			int x=arr[j][0];
			int y=arr[j][1];
			check(x,y);
		}
		
	}
	
	public static void check(int a,int b)
	{
		//System.out.println(a+" "+b);
		int count=0;
		int c = a^b;
		String x=Integer.toBinaryString(c);
		for(int i=0;i<x.length();i++) 
		{
			if(x.charAt(i)=='1')
					count++;
		}
		System.out.println(count);
	}

}
20%2
20/2

0-0-1-0-1
10-5-2-1-0