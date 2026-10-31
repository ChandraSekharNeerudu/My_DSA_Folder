package com.LinkedList;

public class Floyds_fast_slow {
	boolean iscycle(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		
		return false;
	}

}
