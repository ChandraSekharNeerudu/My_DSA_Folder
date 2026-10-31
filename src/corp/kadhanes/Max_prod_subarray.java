package corp.kadhanes;

public class Max_prod_subarray {
	void main() {
		int[] arr= {-2,6,-3,-10,0,2};
		System.out.println(max_prod2(arr));
	}
	
	public int max_prod1(int[] arr) {
		int maxsofar=arr[0];
		int minsofar=arr[0];
		int max=arr[0];	
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			
			if(current<0)
			{
				int temp=maxsofar;
				maxsofar=minsofar;
				minsofar=temp;
			}
			
			maxsofar=Math.max(current, current*maxsofar);
			minsofar=Math.min(current, current*minsofar);
			
			max=Math.max(max, maxsofar);
		}
		return max;
	}
	public int max_prod2(int[] arr) {
		int curmax=arr[0];
		int curmin=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			int temp=Math.max(arr[i],Math.max(arr[i]*curmax, arr[i]*curmin));
			curmin=Math.min(arr[i], Math.min(arr[i]*curmax,arr[i]*curmin));
			curmax=temp;
			max=Math.max(max, curmax);
		}
		return max;
	}
}
