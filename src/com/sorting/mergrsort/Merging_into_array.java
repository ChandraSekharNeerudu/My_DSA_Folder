package com.sorting.mergrsort;

import java.util.Arrays;

public class Merging_into_array {
static int[] merging(int[] arr1,int[] arr2)
{
	int i=0,j=0,k=0;
	for(int a=0;a<arr2.length;a++) {
	while(arr1[i]!=0 && j<arr2.length)
	{
		if(arr1[i]>arr2[j])
		{
			int temp=arr1[i];
		    arr1[i]=arr2[j];
		    arr2[j]=temp;
		}
		i++;
	}
	}
	while(j<arr2.length)
	{
		arr1[i]=arr2[j];
		j++;
		i++;
	}
	return arr1;
}

//merging 2
static int[] merging2(int[] arr1,int[] arr2)
{
	int[] arr3=new int[arr1.length];
	int i=0;int j=0;int k=0;
	while(i<arr2.length && j<arr2.length)
	{
		if(arr1[i]<arr2[j])
		{
			arr3[k]=arr1[i];
			i++;
		}
		else
		{
			arr3[k]=arr2[j];
			j++;
		}
		k++;
	}
	while(i<arr2.length)
	{
		arr3[k]=arr1[i];
		i++;
		k++;
	}
	while(j<arr2.length)
	{
		arr3[k]=arr1[j];
		j++;
		k++;
	}
	for(int a=0;a<arr3.length;a++)
	{
		arr1[a]=arr3[a];
	}
	return arr3;
}
public static void main(String[] args) {
	int[] arr1= {4, 5, 6, 0, 0, 0};
	int[] arr2= {1, 2, 3};
	int[] a=merging(arr1,arr2);
	System.out.println(Arrays.toString(a));
}
}
