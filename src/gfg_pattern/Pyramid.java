package gfg_pattern;

import java.util.Scanner;

public class Pyramid {
	//pyramid pattern
			public static void pyramid(int n)
			{
				 int i, j;
			        
			        // outer loop to handle number of rows
			        for (i = 1; i <= n; i++)
			        {
			           // inner loop to print space
			            for (j = 1; j <= n - i; j++) 
			            {
			                System.out.print(" ");
			            }
			            
			            // inner loop to print star
			            for (j = 1; j <= i; j++)
			            {
			                System.out.print("* ");
			            }
			            
			            // print new line for each row
			            System.out.println();
			        }
				}
			
			
			
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a number");
				int n=sc.nextInt();
				pyramid(n);
				
				
			}
}
