package com.sliding_window.varibale_size;

import java.util.HashMap;
import java.util.Map;

public class Smallest_window_012 {
	 static int smallestSubstring1(String S)
	    {
	        int n = S.length(), l = 0, r = 0, cnt = 0,
	            min_len = Integer.MAX_VALUE;
	        int[] freq = new int[3];
	        //Arrays.fill(freq, 0);
	        while (r < n) {
	            freq[S.charAt(r) - '0']++;
	            if (freq[S.charAt(r) - '0'] == 1)//prathisari 012 first time ++ ayinappudu cnt++ avuthundhi
	                cnt++;
	            if (cnt == 3) {
	                while (freq[S.charAt(l) - '0'] > 1) {//0012 can remove first and 0112 cant remove first
	                    freq[S.charAt(l) - '0']--;
	                    l++;
	                }
	                min_len = Math.min(min_len, r - l + 1);
	                freq[S.charAt(l) - '0']--;
	                l++;
	                cnt--;
	            }
	            r++;
	        }
	        return (min_len == Integer.MAX_VALUE) ? -1: min_len;
	    }
	 static int smallestSubstring2(String s)
	 {
		 int n=s.length();
	       int l=0,r=0;
	       int ans=Integer.MAX_VALUE;
	       int zero=0,one=0,two=0;
			for ( r = 0;  r< s.length(); r++) {
				if (s.charAt(r) == '0') {
					zero++;
				} else if (s.charAt(r) == '1') {
					one++;
				} else {
					two++;
				}
				while(zero>=1 && one>=1 && two>=1)//all 012  present in substring
				{
					
					ans=Integer.min(ans, r-l+1);//length of substring which has 012
					
					if(s.charAt(l)=='0') {
						zero--;
					}else if(s.charAt(l)=='1') {
						one--;
					}else {
						two--;
					}
					l++;
						
				}
			}
			
			return ans;
		 
	 }
	 public static int minLen(int[] arr)
		{
		    Map<Integer,Integer> map=new HashMap<>();
		    map.put(0,0);
		    map.put(1,0);
		    map.put(2,0);
		    map.put(arr[0],map.get(arr[0])+1);
		    map.put(arr[1],map.get(arr[1])+1);
		    int min=Integer.MAX_VALUE;
		    int l=0;
		    int r=2;
		    while(r<arr.length)
		    {
		       map.put(arr[r],map.get(arr[r])+1);
		       if(map.get(0)>0&&map.get(1)>0&&map.get(2)>0){
		           while(map.get(arr[l])>1){
		               map.put(arr[l],map.get(arr[l])-1);
		               l++;
		           }
		          min= Math.min(min,r-l+1);
		       }
		       
		       r++;
		    }
		    return min;
		}

	    public static void main(String[] args)
	    {
	        String S = "0112112";
	        System.out.println(smallestSubstring1(S));
	    }
}
