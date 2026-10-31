package corp.Recursion;

import java.util.Arrays;

public class Sum_Triangle_Array {
	void main() {
		int[] arr= {1,2,3,4,5};
		triangle(arr);
	}

	private void triangle(int[] arr) {
		if(arr.length==0)return;
		
		
		int[] arr1=new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
			arr1[i]=arr[i]+arr[i+1];
		}
		
		triangle(arr1);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
