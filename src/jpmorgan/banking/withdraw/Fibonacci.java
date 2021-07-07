package jpmorgan.banking.withdraw;

public class Fibonacci {
	public static void main(String[] args)
	{
		int a =0;
		int b =1;
		int sum =0;
		int temp;
		int num=0;
		System.out.print(a+" "+b+" ");
		Fibonacci obj = new Fibonacci();
		while(num<10)
		{
			num++;
			temp=obj.number(a, b);
			b=temp;
			System.out.print(temp+" ");
		}
		
	}
	public int number(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}
