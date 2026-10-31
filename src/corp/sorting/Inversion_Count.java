package corp.sorting;

import java.util.Arrays;

public class Inversion_Count {
	public void mergesort(int[] arr) {
		int count=divide(arr,0,arr.length);
		System.out.println(count);
	}
	void main() {
		int[] arr={5,3,4,2,1};//{5,3,2,4,1};
		mergesort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public int divide(int[] arr,int s,int e) {
		int count=0;
		if(e-s!=1) {
			int m=(s+e)/2;
			count+=divide(arr,s,m);
			count+=divide(arr,m,e);
			count+=merge(arr,s,m,e);
		}
		return count;
	}
	public int merge(int[] arr, int s, int m, int e) {
		int l=s;
		int r=m;
		int[] temp=new int[e-s];
		int k=0;
		int count=0;
		while(l<m&&r<e) {
			while(l<m&&arr[l]<=arr[r])
			{
				temp[k++]=arr[l++];
			}
			while(r<e&&arr[r]<arr[l])
			{
				temp[k++]=arr[r++];
				count+=m-l;
			}
		}
		while(l<m)
		{
			temp[k++]=arr[l++];
		}
		while(r<e)
		{
			temp[k++]=arr[r++];
		}
		for(int i=0;i<temp.length;i++)
		{
			arr[s+i]=temp[i];
		}
		return count;
	}
}
