package gfg_pattern;

public class Full_Dimond {
	public static void main(String[] args) {
		//upper dimond
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			for(int k=4;k>=1;k--)
			{
				if(k>=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//lower dimond
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=5;b++)
			{
				if(b<a)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			for(int c=4;c>=1;c--)
			{
				if(c>=a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		
	}
}
