package gfg_pattern;

public class Left_Dimond {
	public static void main(String[] args) {
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
 
	for(int i=1;i<6;i++)
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
