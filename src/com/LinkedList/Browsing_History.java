package com.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Browsing_History {

	int forward(int n,int cur,LinkedList ll)
	{
		int cur1=cur+n;
		if(cur1>=ll.size())
		{
			cur1=ll.size()-1;
		}
		return cur1;
	}
	
	int back(int n,int cur)
	{
		int cur1=cur-n;
		if(cur1<0)
		{
			cur1=0;
		}
		return cur1;
	}
	int visit(String s,LinkedList ll)
	{
		ll.add(s);
		return ll.size()-1;
	}
	void main()
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> ll=new LinkedList<>();
		System.out.println("enter a homepage");
		String homepage=sc.next();
		ll.add(homepage);
		int cur=0;
		cur=visit("google.com",ll);
		cur=visit("facebook.com",ll);
		cur=visit("youtube.com",ll);
		cur=back(1,cur);
		System.out.println(ll.get(cur));
		cur=back(1,cur);
		System.out.println(ll.get(cur));
		cur=forward(1,cur,ll);
		System.out.println(ll.get(cur));
		cur=visit("linkedin.com",ll);
		cur=ll.size()-1;
		cur=forward(2,cur,ll);
		System.out.println(ll.get(cur));
		cur=back(2,cur);
		System.out.println(ll.get(cur));
		cur=back(7,cur);
		System.out.println(ll.get(cur));
				
				
				
	
	}
}
