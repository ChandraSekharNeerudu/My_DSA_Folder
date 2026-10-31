package gfg_pattern;

import java.util.Scanner;

public class Empty_Leftangletriangle {
	public static  void emptyTriandle(int a)
	{
		for(int i=1;i<=a;i++)
		{
			System.out.print("* ");
			for(int j=2;j<=i;j++)
			{
				if(j==i||i==a)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		emptyTriandle(n);
		
	}

}
