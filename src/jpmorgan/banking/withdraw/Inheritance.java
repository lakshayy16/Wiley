package jpmorgan.banking.withdraw;

class Inheritance 
{
	void m1() 
	{
		System.out.println("Hello : Parent");
	}
}
class Inherit1 extends Inheritance 
{
	void m2() 
	{
		
		System.out.println("Hello : Child");
	}
}
class Inherit2 extends Inherit1 
{
	void m3() 
	{
		System.out.println("Hello : GrandChild");
	}
}
public class Test{
public static void main(String[] args)
{
	Test obj = new Test();
	obj.m1();
	obj.m2();
	obj.m3();
}

private void m2() {
	// TODO Auto-generated method stub
	
}

private void m1() {
	// TODO Auto-generated method stub
	
}
}
