package com.LinkedList;

public class Insertion {
	void add(Node head,int ind,Node node) throws InterruptedException//insert before given index
	{
		int i=0;
		Node temp=head;
		Node prev=null;
		while(i<ind)
		{
			i++;
			prev=temp;
			temp=temp.next;
		}
		node.next=temp;
		if(prev!=null)
		{
			prev.next=node;
		}
		else head=node;
		
		System.out.print(head.data);
        Node cur=head.next;
        while(cur!=null)
        {
        	System.out.print("->"+cur.data);
        	Thread.sleep(100);
        	cur=cur.next;
        }
	}
	
	void main() throws InterruptedException
	{
		 // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head1 = new Node(10);
        head1.next = new Node(30);
        head1.next.next = new Node(40);
        head1.next.next.next = new Node(50);
        head1.next.next.next.next = new Node(60);
        
        Node node =new Node(20);
        add(head1,5,node);
       
	}

}
