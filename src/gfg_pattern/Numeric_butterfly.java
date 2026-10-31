package gfg_pattern;

public class Numeric_butterfly {
	public static void main(String[] args) {
		//upper butterfly
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i) System.out.print(j);
		
				else System.out.print(" ");
			}
			for(int k=5;k>=1;k--)
			{
				if(k<=i) System.out.print(k);
				
				else System.out.print(" ");
			}
			System.out.println();
		}
		// lower butterfly
		for(int a=4;a>=1;a--)
		{
			for(int b=1;b<=5;b++)
			{
				if(b<=a) System.out.print(b);
				
				else System.out.print(" ");
			}
			for(int c=5;c>=1;c--)
			{
				if(c<=a) System.out.print(c);
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}
