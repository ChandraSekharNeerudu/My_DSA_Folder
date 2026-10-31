package com.LinkedList;

public class Reverse {
	Node reverse(Node head)
	{
		Node temp;
		Node prev=null;
		while(head!=null)
		{
			temp=head.next;
			head.next=prev;
			prev=head;
			head=temp;
		}
		return prev;//current gead(lat node of the list so make it first)
	}
	void main() throws InterruptedException
	{
		 // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head=reverse(head);
        System.out.print(head.data);
        Node cur1=head.next;
        while(cur1!=null)
        {
        	System.out.print("->"+cur1.data);
        	Thread.sleep(100);
        	cur1=cur1.next;
        }
	}

}
