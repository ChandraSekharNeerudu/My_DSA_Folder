package corp.kadhanes;

import java.util.Arrays;

public class MaxRectangle_2DArray {
	void main() {
		int[][] arr= {{1,2,-1,-4,-20},{-8,-3,4,2,1},{3,8,10,1,3},{-4,-1,1,7,-6}};
		
		System.out.println(usingKadanes(arr));
		//System.out.println(bruteforce(arr));
	}
	
	private int usingKadanes(int[][] arr) {
		int maxsum=arr[0][0];
		int n=arr.length;
		int m=arr[0].length;
		int[] vertical_arr=new int[n];
		for(int i=0;i<m;i++) {
			Arrays.fill(vertical_arr, 0);
			for(int j=i;j<m;j++) {
				for(int k=0;k<n;k++) {
					vertical_arr[k]+=arr[k][j];
				}
				int cur_sum=kadhanes(vertical_arr);
				maxsum=Math.max(maxsum, cur_sum);
			}
		}
		return maxsum;
	}

	private int kadhanes(int[] arr) {
		int cs=0;
		int max_sum=arr[0];
		for(int i=0;i<arr.length;i++) {
			cs=Math.max(cs+arr[i], arr[i]);
			max_sum=Math.max(max_sum, cs);
		}
		
		return max_sum;
	}

	private int bruteforce(int[][] arr) {
		int maxsum=0;
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n*m;i++)
		{
			for(int j=i;j<n*m;j++) 
			{
				int sum=0;
				int r1=i/m; int c1=i%m;
				int r2=j/m; int c2=j%m;
				for(int k=r1;k<=r2;k++)
				{
					for(int l=c1;l<=c2;l++)
					{
						sum+=arr[k][l];
					}
				}
				maxsum=Math.max(maxsum, sum);
			}
		}
		return maxsum;
	}
}
