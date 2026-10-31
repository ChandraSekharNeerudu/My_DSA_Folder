package com.Arrays;
import java.util.*;

public class RemoveDuplicate {
	    // Function to remove duplicates from the given sorted array.
	static void removedupe(int[] arr)
	{
		int i=0;//it stores last unique element index
		for(int j=1;j<arr.length-1;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;
				swap(arr,i,j);
			}
		}
		int[] arr2=new int[i+1];
		for(int j=0;j<i+1;j++)
		{
			arr2[j]=arr[j];
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	
	  static  ArrayList<Integer> removeDuplicates(int[] arr) {
	        // code here
	        ArrayList<Integer> arr1=new ArrayList<Integer>();
	        int i=0,j=1,k=0;
	        arr1.add(arr[0]);
	        while(i<arr.length&&j<arr.length)
	        {
	             if(arr[i]==arr[j])
	             {
	                if(arr1.get(k)!=arr[j])
	                {
	                arr1.add(arr[i]);
	                k++;
	                i=i+1;
	                j=j+1;
	                }
	                i=i+1;
	                j=j+1;
	             }
	             else
	             {
	             arr1.add(arr[j]);
	             k++;
	             i++;
	             j++;
	             }
	       }
	        return arr1;
	    }
	  
	  
	                                                 //optimized//
	  static ArrayList<Integer> removeDuplicates1(int[] arr)
	  {
		  ArrayList<Integer> arr1=new ArrayList<Integer>();
		  arr1.add(arr[0]);
		   //int k=0;		 
		  for(int i=1;i<arr.length;i++)
		  {
			  
			  if(arr[i]!=arr1.getLast()) 
			  {
				  arr1.add(arr[i]);
				  //k++;
			  }
		  }
		  return arr1;
	  }
	  
	  

      // ITERATOR    //

		static void removedup(ArrayList<Integer> arr) {
			if (arr.isEmpty()) {
				return;
			}
			Iterator<Integer> it = arr.iterator();
			int lastValue = it.next();

			while (it.hasNext()) {
				int currentValue = it.next();
				if (currentValue == lastValue) {
					it.remove(); // This is the safe way to remove the element
				} else {
					lastValue = currentValue;
				}
			}
			System.out.println(arr);
		}
		
	  
	    public static void main(String[] args) {
	    	//int[] arr1= {2,2,3,3,4,5,6,6,7,8,8,9,9};
	    	int[] arr1= {1, 2, 2, 3, 4, 4, 4, 5, 5};
	    	System.out.println(removeDuplicates1(arr1));
			
		}
	


}
