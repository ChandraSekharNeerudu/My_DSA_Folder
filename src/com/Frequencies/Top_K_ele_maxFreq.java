package com.Frequencies;
import java.util.*;
import java.util.Map.Entry;
public class Top_K_ele_maxFreq {
	void main() {
		int[] arr= {1,2,2,3,3,3,4};
		int k=2;
		maxFreq2(arr,k);
	}

	private void maxFreq(int[] arr, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		List<Integer> freqarr=new ArrayList<>();
		for(int i=0;i<k;i++)
		{
			int maxkey=map.keySet().iterator().next();
			for(int key:map.keySet())
			{
				if(map.get(key)>map.get(maxkey)) {
					maxkey=key;
				}
			}
			freqarr.add(maxkey);
			map.remove(maxkey);
		}
		System.out.println(freqarr);
	}
	
	private void maxFreq2(int[] arr, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		System.out.println(map);
		TreeMap<Integer,List<Integer>> freqMap=new TreeMap<>(Collections.reverseOrder());
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			int key=entry.getKey();
			int value=entry.getValue();
			List<Integer> l=freqMap.get(value);
			if(l==null) {
				l=new ArrayList<>();
				l.add(key);
				freqMap.put(value, l);
			}else l.add(key);
		}
		System.out.println(freqMap);
		List<Integer> ans=new ArrayList<Integer>();
		for(Entry<Integer,List<Integer>> entry:freqMap.entrySet()) {
			for(int n:entry.getValue()) {
				ans.add(n);
				if(ans.size()==k) break;
			}
			if(ans.size()==k) break;
		}
		System.out.println(ans);
		
	}
	
}
