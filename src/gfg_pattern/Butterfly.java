package gfg_pattern;

public class Butterfly {

	public static void main(String[] args) {
		butterfly();
		// upper butterfly
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=6;k>=1;k--)
			{
				if(k>i)
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
		
		// lower butterfly
		for(int a=5;a>=1;a--)// 4 bcz we need one less row than upper 
		{
			for(int b=1;b<=6;b++)
			{
				if(b<=a)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int c=6;c>=1;c--)
			{
				if(c<=a)
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
	// optimized 
	static void butterfly()
	{
		 int N = 6;
	        
	        // --- Upper Butterfly (Rows 1 to N) ---
	        for (int i = 1; i <= N; i++) {
	            // Loop for all columns in the row (2 * N columns total)
	            for (int j = 1; j <= 2 * N; j++) {
	                
	                // Logic check for both left and right wings
	                boolean isLeftWing = (j <= i);
	                boolean isRightWing = (j > 2 * N - i);
	                
	                if (isLeftWing || isRightWing) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	        // --- Lower Butterfly (Rows N-1 down to 1) ---
	        // Note: Starts at N-1 to avoid repeating the middle line (i=N).
	        for (int i = N - 1; i >= 1; i--) { 
	            for (int j = 1; j <= 2 * N; j++) {
	                
	                // Logic check for both lower wings
	                boolean isLeftWing = (j <= i);
	                boolean isRightWing = (j > 2 * N - i);
	                
	                if (isLeftWing || isRightWing) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	}
}


