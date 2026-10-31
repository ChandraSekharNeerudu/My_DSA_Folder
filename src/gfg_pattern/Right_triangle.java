package gfg_pattern;

public class Right_triangle {
	public  void main(String[] args) {
		easy();
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j<6 ; j++) {

				if (i + j < (6 - 1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	// easy way
	void easy()
	{
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<6;j++)
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
			System.out.println();
		}
	}
}

