package jpmorgan.banking.withdraw;
//Usage of This variable
public class ThisKeyword {
	int a =10;
	int b=20;
	void m1(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b); // using this keyword to access global variable
	}
	public static void main(String args[])
	{
		ThisKeyword obj = new ThisKeyword();
		obj.m1(3, 4);
	}
}
