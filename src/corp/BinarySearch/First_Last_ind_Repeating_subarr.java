package corp.BinarySearch;

import java.util.Arrays;

public class First_Last_ind_Repeating_subarr {
	void main() {
		int[] arr= {1,3,5,5,5,5,7,12,25};
		int[] result=first_last_ind(arr,5);
		System.out.println(Arrays.toString(result));
	}

	private int[] first_last_ind(int[] arr,int k) {
		
		return new int[] {first(arr,k),last(arr,k)};
	}

	private int last(int[] arr, int k) {
		int ind=-1;
		int l=0;int r=arr.length;
		
		while(l<r) {
			int m=l+(r-l)/2;
			if(arr[m]==k) {
				ind=m;
				l=m+1;
			}else if(arr[m]>k) {
				r=m-1;
			}else l=m+1;
		}
		
		return ind;
	}

	private int first(int[] arr,int k) {
		int l=0;int r=arr.length;
		int ind=-1;
		
		while(l<r) {
			int m=l+(r-l)/2;
			if(arr[m]==k) {
				ind=m;
				r=m-1;
			}else if(arr[m]>k) {
				r=m-1;
			}else l=m+1;
		}
		return ind;
	}

}
