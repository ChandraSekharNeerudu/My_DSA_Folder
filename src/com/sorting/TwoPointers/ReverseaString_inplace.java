package com.sorting.TwoPointers;

public class ReverseaString_inplace {
	static String reverseWithSpacesIntact(String S) {
        // your code here
        int s=0;
        int e=S.length()-1;
        char[] C=S.toCharArray();// to convert string to char array
       while(s<e)
       {
           if(C[s]==' ')
           {
               s++;
               continue;
           }
           else if(C[e]==' ')
           {
               e--;
               continue;
           }
           else
           {
        	   swap(C,s,e);
               s++;
               e--;
           }
       }
       S=String.valueOf(C);//for converting char array to string
       return S;
    }
    static void swap(char[] C,int s,int e)
    {
        char temp=C[s];
        C[s]=C[e];
        C[e]=temp;
    }
    public static void main(String[] args) {
		String str="hello world";
		System.out.println(reverseWithSpacesIntact(str));
	}

}
