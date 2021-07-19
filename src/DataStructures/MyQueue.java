package DataStructures;

import DataStructures.MyLinkedList.Node;

public class MyQueue {
	private Node head , rear ;
	
	public void enqueue(Integer e) {
		
		Node toAdd = new Node(e);
		if(head==null) {
			head = rear = toAdd;
			return ;
		}
		rear.next = toAdd;
		rear=rear.next;
	}
	
	public Integer dequeue() {
		if(head==null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		return temp.data;
	}
	public void peek() {
		System.out.println(rear.data);
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
}
