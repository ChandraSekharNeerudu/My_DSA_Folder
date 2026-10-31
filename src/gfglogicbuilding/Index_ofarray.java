package gfglogicbuilding;
import java.util.*;

public class Index_ofarray {
	public static void index(int[] arr,int a)
	{
		int sum=0,ind1=0,ind2=0;
		
		for(int i=0;i<arr.length;i++)
		{
		   for(int j=i+1;j<arr.length;j++)
		    {
			 sum=arr[i]+arr[j];
			 if(sum==a)
			 {
			 ind1=i;
			 ind2=j;
			 break;
		     }
		   }
		}
		if(sum==a)
		{
		System.out.println(ind1+" "+ind2);
		}
		else
		{
			System.out.println(" index not found");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in arry");
		int n=sc.nextInt();
		System.out.println("Array elements one by one :");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to find indexes :");
		int a=sc.nextInt();
		index(arr,a);
	}

}
