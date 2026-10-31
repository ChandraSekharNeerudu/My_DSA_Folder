package com.Arrays;

public class Min_incby_K {
	static int mink(int[] a,int k)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			
		}
		System.out.println(max);
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if((max-a[i])%k==0)
			{
				count=count+((max-a[i])/k);
			}
			else { return -1;}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a= {19,7,4,16};
		System.out.println(mink(a,3)); // 3 thoni migilina vatini enni sarlu inc chesthe max ki equal avuthayi
	}

}
