package com.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Node class to define a linked list node
	class Node {
	    int data;
	    Node next;

	    // Constructor to initialize a new node with data
	    Node(int newData) {
	        data = newData;
	        next = null;
	    }
	}

public class Middle_value {
	void mid(Node head)
	{
		Node slow=head;
		Node fast=head;
		Node temp=null;
		while(fast !=null && fast.next !=null)
		{
			temp=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
		{
			System.out.println(slow.data);
		}
		else System.out.println(temp.data+" "+slow.data);
	}
	
	void remove(Node head,int n) throws InterruptedException
	{
		Node prev=null;
		Node cur=head;
		for(int i=0;i<n;i++)
		{
			 prev=cur;
			 cur=cur.next;
		}
		prev.next=cur.next;
		 System.out.print(head.data);
	        Node cur1=head.next;
	        while(cur1!=null)
	        {
	        	System.out.print("->"+cur1.data);
	        	Thread.sleep(100);
	        	cur1=cur1.next;
	        }
	}

	void main() throws InterruptedException
	{
		 // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        remove(head, 2);
//        List<Integer> list=new ArrayList(Arrays.asList(10,20,30));
//        int l=list.size();
//        if(l%2==0)
//        {
//        	System.out.println(list.get((l/2)-1));
//        	System.out.println(list.get((l/2)));
//        }
//        else System.out.println(list.get(l/2));
        
	}

}
