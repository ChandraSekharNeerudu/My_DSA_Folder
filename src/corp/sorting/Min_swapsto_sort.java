package corp.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Min_swapsto_sort {
	static int countminswaps(int[] arr) {
		int count=0;
		int[] temp=arr.clone();
		Arrays.sort(temp);
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) map.put(arr[i],i);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=temp[i]) {
				int ind=map.get(temp[i]);
				
				int t=arr[i];
				arr[i]=arr[ind];
				arr[ind]=t;
				
				map.put(arr[ind], i);
				map.put(arr[i], ind);
				count++;
			}
		}
		return count;
	}
	
	void main() {
		int[] arr= {10,19,6,3,5};
		System.out.println(countminswaps(arr));
	}
}
