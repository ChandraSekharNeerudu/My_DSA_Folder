package corp.BinarySearch;

public class Findelein_circler_arr {
	void main() {
		int[] arr= {5,6,7,8,9,10,1,2,3};
		System.out.println(circuler(arr,3));
	}

	private int circuler(int[] arr, int k) {
		int l=0;int r=arr.length-1;
		while(l<=r) {
			int m=l+(r-l)/2;
			if(arr[m]==k) {
				return m;
			}
			if(arr[m]>=arr[l])
			{
				if(k<arr[m]&&k>=arr[l]) r=m-1;
				else l=m+1;
			}
			else
			{
				if(k<=arr[r]&&k>arr[m]) l=m+1;
				else r=m-1;
			}
		}
		return -1;
	}
}
