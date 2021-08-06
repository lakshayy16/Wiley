package TestExample;

import java.util.*;

public class LeetCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String check="";
		boolean chk=false;
		String s1 = sc.nextLine();
	       String[]  array = s1.split(",");
	       for(int i=0;i<array.length;i++)
	       {
	    	   array[i]=array[i].trim();
	       }
	       for(int i=0;i<s.length();i++)
	       {
	    	   check+=s.charAt(i);
	    	   for(String a : array) {
	    		   if(a.equals(check))
	    		   {
	    			   System.out.print(check+"-----");
	    			   check="";
	    			   chk=true;
	    		   }
	    	   }
	       }
	       if(check.length()>0)
	    	   chk=false;
	       System.out.println(chk+" "+check);

	}

}
