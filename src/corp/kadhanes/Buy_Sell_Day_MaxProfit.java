 package corp.kadhanes;

public class Buy_Sell_Day_MaxProfit {
	void main() {
		int[] arr= {7,1,5,3,6,4};
		System.out.println(max_pro(arr));
	}
	public int max_pro(int[] arr) {
		int minso_far=arr[0];
		int maxpro=0;
		for(int i=1;i<arr.length;i++) {
			minso_far=Math.min(minso_far, arr[i]);
			
			maxpro=Math.max(maxpro,arr[i]-minso_far);
		}
		return maxpro;
	}
}
