package DataStructures;
import java.util.*;
public class queueTest {

	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue();
		mq.enqueue(12);
		mq.enqueue(22);
		mq.enqueue(32);
		mq.enqueue(42);
		mq.print();
		System.out.println("");
		System.out.println( mq.dequeue());// popping the first value
		System.out.println(mq.dequeue());
		mq.peek();//returns the rear value in the queue


//		Queue<Integer> q = new LinkedList<>();
//		for(int i =0;i<10;i++) {
//			q.add(i);offer can be used which throws null when the queue is full 
//		}
//		System.out.println(q);
//		System.out.println(q.remove());poll can be used
//		System.out.println(q.add(0));
	} 
	//Pop takes place from head - dequeue()
	// Push takes place from rear- enqueue()

}
