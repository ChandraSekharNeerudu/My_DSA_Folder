package corp.kadhanes;

public class multiple_buysell_maxprofit {
	void main() {
		int[] arr= {7,1,5,3,6,4};
		//System.out.println(totalpro(arr));
		int[] arr1= {-1,-2,6,-3,-5,3,-4,6,-2,-3};
		alternates(arr1);
	}
	
	void alternates(int[] arr) {//edhi vere problem bro
		int start =0;
		int maxstart=0;
		int maxend=0;
		int maxlength=0;
		for(int end=1;end<arr.length;end++)
		{
			
			if(arr[end]<0&&arr[end-1]<0 || arr[end]>=0&&arr[end-1]>=0) {//same symbol
			start=end;
			}
			else {
				if((end-start+1)>maxlength) {
					maxstart=start;
					maxend=end;
					maxlength=end-start+1;
				}
			}
		}
		System.out.println(maxlength);
		for(int i=maxstart;i<=maxend;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public int totalpro(int[] arr) {
		int maxpro=0;
		int buyday=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<buyday)
			{
				buyday=arr[i];
			}
			else
			{
				maxpro+=arr[i]-buyday;
				buyday=arr[i];
			}
		}
		return maxpro;
	}
}
