
package corp.sorting;

import java.util.HashMap;
import java.util.Map;

public class subarr_equal0s1s {
	public int countofarrwithequal0s1s(int[] arr) {
		int count=0;
		int cs=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) arr[i]=-1;
			
			cs+=arr[i];
			
			if(map.containsKey(cs)) {
				count+=map.get(cs);
			}
			map.put(cs, map.getOrDefault(cs, 0)+1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr= {1,0,0,1,0,1,1};
		subarr_equal0s1s obj=new subarr_equal0s1s();
		System.out.println(obj.countofarrwithequal0s1s(arr));
	}
}
