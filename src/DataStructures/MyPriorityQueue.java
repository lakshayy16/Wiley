package DataStructures;

import java.util.PriorityQueue;
// benefit while extracting the max value is complexity is nlog(k)
// where n = size of list , k = max number of values needed 
// general sorting has complexity of nlog(n)
public class MyPriorityQueue {

	public static void main(String[] args) {
	 PriorityQueue<String > pq = new PriorityQueue<>();
	 pq.add("Kiwi");
	 pq.add("Apple");
	 pq.add("Mango");
	 pq.add("Banana");
	 System.out.println(pq);
	 
	
	}

}
