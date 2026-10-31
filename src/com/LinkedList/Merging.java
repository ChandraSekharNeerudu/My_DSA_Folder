package com.LinkedList;

class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int newData) {
        data = newData;
        next = null;
    }
}
public class Merging {
	void merge(Node head1,Node head2) throws InterruptedException
	{  Node dummy = new Node(-1);
       Node current = dummy;

    // 2. Iterate while both lists have nodes available
    while (head1 != null && head2 != null) {
        // First, take a node from list1
        current.next = head1;
        head1 = head1.next;
        current = current.next;

        // Second, take a node from list2
        current.next = head2;
        head2 = head2.next;
        current = current.next;
    }
    if(head1!=null)
    {
    	current.next = head1;
    }
    Node head=dummy.next;
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
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);
        head1.next.next.next.next.next = new Node(60);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(6);
        head2.next.next.next.next.next.next = new Node(8);
        
        merge(head1,head2);
	}

}
