package gfg_pattern;

public class Pyramid_with_NoSpace {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>1;j--)
			{
				if(j>i) System.out.print(" ");
				else System.out.print("*");
			}
			for(int k=1;k<=5;k++)
			{
				if(k<=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
