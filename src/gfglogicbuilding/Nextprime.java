package gfglogicbuilding;

import java.util.Scanner;

public class Nextprime {
	public static boolean isprime(int p)
    {
      for(int i=2;i*i<=p;i++)
        {
            if(p%i==0)
            {
            
               return false;
            }
            
        }
       return true;
    }
public static void main(String args[]) {
    // Your Code Here
   // Solution obj=new Solution ();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value:");
    int p=sc.nextInt();
   // boolean b=false;
    p+=1;
    while(true)
    {
     if(isprime(p))
     {
       System.out.println(p); 
       break;
     }
     p++;
    }
    
}


}
