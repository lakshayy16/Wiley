package jpmorgan.banking.withdraw;
import java.util.*;
class user{
	String name,des,id;
	int age;
	double sal;
}
public class Designation {
	ArrayList<user> arr= new ArrayList<>();
	static user emp;
	static String id[] = new String[10];
	static String name[] = new String[10];
	static int age[] = new int[10];
	static double sal[] = new double[10];
	static String des[] = new String[10];
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int i =0;
		boolean valid = true;
		boolean counter = true;
		int n;
		n=start();
		while(counter)
		{
		switch(n)
		{
		case 1:	
		{
			emp = new user();
			info(i);
			while(check())
			{
			i++;
			info(i);
			}
			n=start();
		break;
		}
		case 2:
		System.out.println("Details:\n");
		System.out.print("Name: ");
		System.out.print("Age: ");
		System.out.print("Designation ");
		System.out.print("Salary \n");
		for(int j=0;j<10;j++)
		{
		if(name[j]!=null)
		{
		System.out.print(name[j]+" ");
		System.out.print(age[j]+" ");
		System.out.print(des[j]+" ");
		System.out.print(sal[j]+" \n");
		}
		else
			break;
		}
		n=start();
		break;
		case 3:
			System.out.println("Enter your id for Salary appraisal");
			int cid=sc.nextInt();
			System.out.println("Enter your % for Salary appraisal");
			double p=sc.nextInt();
			emp.sal=emp.sal+(emp.sal*(p/100));
			System.out.println("Updated salary:"+emp.sal);
			n=start();
			break;
		case 4:
			System.out.println("Enter the id to be deleted:");
			int did=sc.nextInt();
			arr[did]
			
		case 5:
			System.out.println("Program Terminated , Thank You ! ");
			counter=false;
			break;
		default:
			System.out.println("Wrong Input : Try Again!");
			n=start();
	}
	}
	
	}
	public static boolean checkname(String name)
	{
		int count=0;
		for(int j=0;j<name.length();j++)
		{
		if(Character.isWhitespace(name.charAt(j)))
			count++;
		if(count>2)
		{
			System.out.println("The spaces between words are out of limits , please keep max 2 spaces");
			return false;
		}
		}
		return true;
	}
	public static int start()
	{
		System.out.println("Enter 1)Create_Employee 2)Display 3)Raise Salary 4)Delete_Employee 5)Exit");
		int n = sc.nextInt();
		return n ;
	}
	public static boolean check()
	{
		System.out.println("Do you want to continue : Yes/No");
		String c=sc.next();
		if(c.equals("Yes"))
		{
			return true;
		}
		else
			return false;
	}
	public static void info(int i)
	{
		boolean checkage =true;
		boolean check = true;
		sc.nextLine();
		System.out.println("Enter the name: ");
		emp.name = sc.nextLine();
		
		while(!checkname(name[i]))
		{
			System.out.println("Enter the name: ");
			emp.name = sc.nextLine();
		}
		while(checkage)
		{
		System.out.println("Enter the Age: ");
		emp.age = Integer.parseInt(sc.nextLine());
		if(emp.age>=18 && emp.age<=60)
			checkage=false;
		else 
			System.out.println("Age out of Bounds , enter again !");
		}
		while(check)
		{
			System.out.println("Enter the Designation: ");
			emp.des=sc.nextLine();
			if(emp.des.equals("Programmer"))	
			{
				emp.sal=350000;
				check=false;
			}
			else if(emp.des.equals("Tester"))
			{
				emp.sal=30000;
				check=false;
			}
			else if(emp.des.equals("Manager"))
			{
				emp.sal=25000;
				check=false;
			}
		}
	}
}