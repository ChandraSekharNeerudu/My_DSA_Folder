package com.LinkedList;

public class Exchange_first_last_circular {
	void exchange(Node head) throws InterruptedException
	{
		Node slow=head;
		Node fast=head;
		while(fast.next!=slow)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		Node second=head.next;
		fast.next=head;
		head.next=slow;
		slow.next=second;
		display(slow);//now slow is the head
	}
	void display(Node head) throws InterruptedException
	{
		Node slow=head;
		Node fast=head;
		System.out.print(slow.data);
		int count=1;
		while(fast.next!=slow)
		{
			slow=slow.next;
			fast=fast.next.next;
			System.out.print("->"+slow.data);
			count++;
			Thread.sleep(100);
		}
		System.out.println();
		System.out.println("number of elements "+count);
	}
	void main() throws InterruptedException
	{
		// Create a hard-coded linked list
				// 11 -> 2 -> 56 -> 12
		        Node head = new Node(11);
		        head.next = new Node(2);
		        head.next.next = new Node(56);
		        head.next.next.next = new Node(12);
		        head.next.next.next.next=new Node(40);
		        head.next.next.next.next.next=new Node(60);

		        head.next.next.next.next.next.next = head;
		        display(head);
		        exchange(head);
	}

}
