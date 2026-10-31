package com.LinkedList;

public class Deletion_Ciclar {
	void atBegin(Node head) throws InterruptedException
	{
		Node temp=head.next;
		head.next=null;
		Node last=temp;
		while(last.next!=head)
		{
			last=last.next;
		}
		last.next=temp;
		head=temp;
		display(head);
	}
	void atPos(Node head,int pos) throws InterruptedException
	{
		if(pos==0)
		{
			atBegin(head);
			return;
		}
		int count=0;
		Node temp=head;
		Node prev=head;
		while(count<pos)
		{
			prev=temp;
			temp=temp.next;
			count++;
		}
			prev.next=temp.next;
			display(head);
		
	}
	void main() throws InterruptedException
	{
		// Create a hard-coded linked list
		// 11 -> 2 -> 56 -> 12
        Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);

        head.next.next.next.next = head;
        atPos(head,0);
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

}
