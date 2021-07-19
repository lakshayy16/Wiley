package DataStructures;

import java.util.*;

public class LinkedListTest {
	public static void main(String args[]) {
		List<Integer> l1 = new LinkedList<>();
		List<Integer>  al = new ArrayList<>();
		l1.add(12);
		l1.add(3);
		l1.add(32);
		
		timediff(l1);
		timediff(al);
		//System.out.println(l1.get(0));
		//l1.set(1, 13);
		//System.out.println(l1);

	}
	static void timediff(List<Integer> list)
	{
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
