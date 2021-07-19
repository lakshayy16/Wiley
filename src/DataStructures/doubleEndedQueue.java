package DataStructures;

import DataStructures.MyLinkedList.Node;

public class doubleEndedQueue<E> {
	Node <E> head , tail;
	
	public static class Node<E> // creating class node
	{ 
		E data;
		Node<E> next,prev;
		public Node(E data)
		{
			this.data = data;
			this.next = this.prev = null;
		}
	}
	
	public void addToHead(E data) // adding a note to the first
	{
		Node<E> toAdd = new Node<>(data);
		if(head==null)
		{
			head=tail=toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev=head;
		head=toAdd;
	}
	
	public E removeLast() // removing the last node
	{
		if(head==null)
			return null;
		Node<E> toRemove = tail;
		tail=tail.next;
		tail.prev=null;
		
		if(tail==null)
			head=null;
		
		return toRemove.data;
	}
	public void print()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[])
	{
		doubleEndedQueue<Integer> deque = new doubleEndedQueue<>();
		
		for(int i=0;i<10;i++)
		{
			deque.addToHead(i);
		}
		deque.print();

	}
}
