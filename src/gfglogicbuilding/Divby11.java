package gfglogicbuilding;

import java.util.Scanner;      //           O(log 10 n),O(1)       //

public class Divby11 {
	// checking number is div by 11
		public static boolean divBy11(long a)
		{
			
			long b=a;
			long c=0;
			int i=1,even=0,odd=0;
			while(a>0)
			{
				c=a%10;
				if(i%2==0)
				{
					even+=c;
			    }
				else {odd+=c;}
				a=a/10;
				i++;
			}
			c=Math.abs(even-odd);
			if(c==0)
			{
				return true;
			}
			return c%11==0;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value :");
			long n=sc.nextLong();
			if(n<11)
			{
				System.out.println(false);
			}
			System.out.println(divBy11(n));
			
		}

}
