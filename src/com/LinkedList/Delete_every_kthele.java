package com.LinkedList;

public class Delete_every_kthele {
	void delete(Node head,int k)
	{
		int flag=1;
		Node temp=head;
		Node prev=temp;
		while(temp!=null)
		{
			flag++;
			prev=temp;
			temp=temp.next;
			if (flag == k) {
				if (temp.next != null) {
					prev.next = temp.next;
					temp = temp.next;
					flag = 1;
				}

				else {
					prev.next = null;
					temp = temp.next;
					flag = 1;
				}
			}
		}
		
		System.out.print(head.data);
        Node cur=head.next;
        while(cur!=null)
        {
        	System.out.print("->"+cur.data);
        //	Thread.sleep(100);
        	cur=cur.next;
        }
	}
	
	void main()
	{
		 // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);
        head1.next.next.next.next.next = new Node(60);
        
        delete(head1,3);
	}

}
