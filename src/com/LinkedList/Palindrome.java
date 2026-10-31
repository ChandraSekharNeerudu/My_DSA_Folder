package com.LinkedList;

public class Palindrome {
	Node reverse(Node head) throws InterruptedException
	{
		
		Node cur=head.next;
		Node prev=head;
		head.next=null;
		while(cur.next!=null)
		{
			Node temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;;
		}
		cur.next=prev;
		head=cur;
		 
		return head;
	}
	void main() throws InterruptedException
	{
		Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(1);
//        head1.next.next.next.next = new Node(50);
//        head1.next.next.next.next.next = new Node(60);

        Node slow=head1;
		Node fast=head1;
		Node temp=null;
		while(fast !=null && fast.next !=null)
		{
			temp=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		Node second_half;
		if(fast!=null)
		{
			second_half=slow;
		}
		else second_half=slow;
		second_half=reverse(second_half);
		while(second_half!=null)
		{
			if(second_half.data != head1.data)
			{
				System.out.println("false");
				return ;
			}
			second_half=second_half.next;
			head1=head1.next;
		}
        System.out.println("true");
	}

}
