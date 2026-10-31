package corp.DP;

public class JumpK {
	void main() {
		int[] arr= {2,3,1,0,4};
		System.out.println(jump(arr));
	}

	private boolean jump(int[] arr) {
		int md=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(i>md) return false;//we can't reach that index
			md=Math.max(md, i+arr[i]);
			if(md>=n) return true;
		}
		return true;
	}
}
