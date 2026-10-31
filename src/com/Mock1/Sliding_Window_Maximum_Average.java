package com.Mock1;

public class Sliding_Window_Maximum_Average {
	public static boolean isAmstrong(int n)
	{
		int c=0;
		int temp=n;
		while(temp!=0) {
			c++;
			temp=temp/10;
		}
		temp=n;
		int sum=0;
		while(n!=0) {
			int l=n%10;
			sum+=Math.pow(l, c);
			n=n/10;
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		int[] scores = {50, 40, 30, 20, 10};
		System.out.println(isAmstrong(154));
	}
	
	
}
