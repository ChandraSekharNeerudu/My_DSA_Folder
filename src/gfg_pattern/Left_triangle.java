package gfg_pattern;

import java.util.Scanner;

public class Left_triangle {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number :");
	   int n=sc.nextInt();
	    // print right angle triangle of size n
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(j==i||j<i)
	            {
	                System.out.print("*"+" ");
	            }
	            else
	            {
	                System.out.print("");
	            }
	        }
	        System.out.println();
	   

	}

	}
}
