package gfg_pattern;

public class Cross_with_numbers {
	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=5;i++)
		{
			if(i<=5/2+1)n++;
			else n--;
			for(int j=1;j<=5;j++)
			{ 
				if(j==i || j==5-i+1 ) // or i+j==6
					{
					System.out.print(n);
					}
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
