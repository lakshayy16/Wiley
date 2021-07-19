package DataStructures;

public class MyLinkedList {
	
	Node head;
	void add(int data) 
	{
		Node toAdd = new Node(data);
		
		if(head==null) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next !=null) {
			temp = temp.next;
	}
		temp.next=toAdd;
	}
	
//	boolean isEmpty() {
//		return head == null;
//	}
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data) 
		{
			this.data = data;
			next=null;
		}
	}
	
	void print() {
		Node temp = head;
		while(temp!=null) { 
			System.out.println(temp.data+" ");
			temp = temp.next;
	}
	}
	public static void main(String args[]) {
		MyLinkedList myLL = new MyLinkedList();
		myLL.add(12);
		myLL.add(56);
		myLL.print();
	}
}
