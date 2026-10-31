package com.Arrays;

public class Fibbonacci {
	static int nextFibbonacci(int n) {
		int a=0;int b=1;
		int fib=0;
		for(int i=0;i<n;i++) {
			fib=a;
			int c=a+b;
			a=b;
			b=c;
		}
		return fib;
	}
	void main() {
		int n=5;
		int next=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				
				if(j<=i)
				{
					System.out.print(nextFibbonacci(next++)+" ");
				}
			}
			System.out.println();
		}
		
	}
}
