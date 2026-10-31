package corp.BinarySearch;

public class Peakele {
	 void main() {
		 int[] arr= {10,20,15,2,23,90,80};
		 int n=peak(arr);
		 System.out.println(arr[n]);
	 }

	 private int peak(int[] arr) {
		 if(arr.length==1) return 0;
		 
		if(arr[0]>=arr[1]) return 0;
		int n=arr.length;
		if(arr[n-1]>=arr[n-2]) return arr[n-1];
		
		int l=1;int r=n-2;
		while(l<=r) {
			
			int m=l+(r-l)/2;
			if(arr[m]>=arr[m-1]&&arr[m]>=arr[m+1]) return m;
			else if(arr[m-1]>arr[m]) {
				r=m-1;
			}else l=m+1;
			
		}
		return -1;
		
	 }
	
}
