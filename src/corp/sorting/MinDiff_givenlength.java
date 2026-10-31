package corp.sorting;

import java.util.Arrays;

public class MinDiff_givenlength {
	public int minDiff(int[] arr,int lng) {
		int minDiff=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-lng;i++) {
			int diff=arr[i+lng-1]-arr[i];
			minDiff=Math.min(minDiff, diff);
		}
		return minDiff;
	}
	void main() {
		int arr[]= {3,4,1,9,56,7,9,12};
		MinDiff_givenlength obj=new MinDiff_givenlength();
		System.out.println(obj.minDiff(arr, 5));
	}
}
