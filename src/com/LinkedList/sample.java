package com.LinkedList;

public class sample {
	
	boolean palindrom(Node head)
	{
		//find middle
		Node start=head;
		Node end=head;
		while(end!=null && end.next!=null)
		{
			start=start.next;
			end=end.next.next;
		}
		//reverse the any one half here 2nd half
		Node temp=start.next;
		start.next=null;
		Node prev=start;
		start=temp;
		while(start !=null)
		{
			temp=start.next;
			start.next=prev;
			prev=start;
			start=temp;
		}
		//now first half starts with head,and second half starts with prev now compare them
		while(head!=null)
		{
			if(head.data!=prev.data)
			{
				return false;
			}
			head=head.next;
			prev=prev.next;
		}
		return true;
	}
	
	
	void main() throws InterruptedException
	{
		Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(1);
        //head1.next.next.next.next.next = new Node(1);
        
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        System.out.println(palindrom(head1));
        

	}
}
