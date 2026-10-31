package corp.kadhanes;

//we are printing sum of the the sub array that gives the max sum
public class Max_Sum_Subarray {
	void main() {
		int[] arr= {2,3,-8,7,-1,2,3};
		System.out.println(max_sum2(arr));
	}
	public int max_sum1(int[] arr) {
		int ms=0;
		int cs=0;
		for(int i=0;i<arr.length;i++) {
			// Decision: Do I add the current element to my existing sum, 
            // or is the current element better off starting a new subarray?
			cs=Math.max(cs+arr[i],arr[i]);
			
			ms=Math.max(cs, ms);
		}
		return ms;
	}
	public int max_sum2(int[] arr) {
		int cs=0;int ms=0;
		for(int i=0;i<arr.length;i++) {
			cs+=arr[i];
			if(cs<0) cs=0;
			ms=Math.max(ms, cs);
		}
		return ms;
	}
}
