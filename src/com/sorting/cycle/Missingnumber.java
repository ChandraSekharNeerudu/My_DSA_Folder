package com.sorting.cycle;

import java.util.ArrayList;

public class Missingnumber {
static int missing(int[] arr)        // Expected i/p=[4,0,2,1],o/p=3 , O(n)
{
	int n=arr.length;
	int Actualsum=(n*(n+1))/2;
	int Givensum=0;
	for(int x:arr)
	{
		Givensum+=x;
	}
	return Actualsum-Givensum;
}

// Using cycle sort   values from 0 - n
static int cycle(int[] arr)
{
	int n=arr.length;
	int i=0;
	// for sorting
	while(i<n)
	{
		int corectindex=arr[i]; // Bcz array had values from 0 - n 
		if(i!=corectindex && corectindex<n)
		{
			swap(arr,i,corectindex);
		}
		else
		{
			i++;
		}
	}
	// finding missing value after sorting
	for(int j=0;j<n;j++)
	{
		if(j!=arr[j])
		{
			return j;
		}
	}
	return n;
	
}


//[4,3,2,7,8,2,3,1] values from 1 - n
//array had duplictes and multiple missing values
static ArrayList<Integer> cycle2(int[] arr)
{
	ArrayList<Integer> result=new ArrayList();
	int n=arr.length;
	int i=0;
	// for sorting
	while(i<n)
	{
		int corectindex=arr[i]-1;//Bcz array had values from 1 - n    
		if(i!=corectindex && corectindex<n && arr[i]!=arr[corectindex])
		{
			swap(arr,i,corectindex);
		}
		else
		{
			i++;
		}
	}
	//finding mising values
	for(int j=0;j<n;j++)
	{
		if(j!=arr[j]-1)
		{
			result.add(j+1);
		}
	}
	return result;
	
}


static void swap(int[] arr,int i,int correct)
{
  int temp=arr[i];
  arr[i]=arr[correct];
  arr[correct]=temp;
}


public static void main(String[] args) {
//	int[] arr= {4,0,2,1};
//	System.out.println(cycle(arr));
	// calling the multiple mssing and duplicate method cycle2()
	int[] arr= {4,3,2,7,8,2,3,1};
	System.out.println(cycle2(arr));
}
}
