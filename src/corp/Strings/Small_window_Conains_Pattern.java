package corp.Strings;

import java.util.HashMap;
import java.util.Map;

/*📥 Sample Test Cases
Test Case 1:
s = "ADOBECODEBANC"

p = "ABC"

Output: "BANC"

Explanation: Substrings like "ADOBEC" contain 'A', 'B', and 'C', 
but "BANC" is the shortest one with a length of 4.*/
public class Small_window_Conains_Pattern {
	void main() {
		String s1="ADOBECODEBANC";
		String p="ABC";
		smallWindow(s1,p);//best 
		smallWindow2(s1,p);//only works when p had unique vlaues 
	}
	//not orks when p had duplicates 
	private static void smallWindow2(String s1, String p) {
		if (s1 == null || p == null || s1.length() < p.length()) {
	        System.out.println("No valid window found");
	        return;
	    }

	    Map<Character,Integer> map=new HashMap<>();
	    for(char c:p.toCharArray())
	    	map.put(c,0);
	    int l=0,ml=0,mr=0,count=0,min=Integer.MAX_VALUE;
	    for(int r=0;r<s1.length();r++)
	    {
	    	char c=s1.charAt(r);
	    	if(map.containsKey(c))
	    	{
	    		if(map.get(c)==0)
	    			count++;
	    		map.put(c, map.get(c)+1);
	    	}
	    	while(count>=p.length())
	    	{
	    		if(r-l+1<min)
	    		{
	    			min=r-l+1;
	    			ml=l;
	    			mr=r;
	    		}
	    		
	    		char left=s1.charAt(l);
	    		if(map.containsKey(left))
	    		{
	    			if(map.get(left)==1)
	    				count--;
		    		map.put(left, map.get(left)-1);
	    		}
	    		l++;
	    	}
	    }
	    if (min == Integer.MAX_VALUE) {
	        System.out.println("No valid window found");
	    } else {
	        System.out.println(min + " " + s1.substring(ml, mr + 1));
	    }
	}
	private static void smallWindow(String s1, String p) {
	    if (s1 == null || p == null || s1.length() < p.length()) {
	        System.out.println("No valid window found");
	        return;
	    }

	    int[] map = new int[256];
	    for (char c : p.toCharArray()) {
	        map[c]++;
	    }

	    int l = 0;
	    int count = p.length();
	    int minLen = Integer.MAX_VALUE;
	    int ml = 0, mr = -1;

	    for (int r = 0; r < s1.length(); r++) {
	        char rightChar = s1.charAt(r);

	        if (map[rightChar] > 0) {
	            count--;
	        }
	        map[rightChar]--;

	        // When window contains all characters of pattern p
	        while (count == 0) {
	            if (r - l + 1 < minLen) {
	                minLen = r - l + 1;
	                ml = l;
	                mr = r;
	            }

	            char leftChar = s1.charAt(l);
	            map[leftChar]++;

	            // If dropping leftChar breaks pattern match requirement
	            if (map[leftChar] > 0) {
	                count++;
	            }
	            l++; // Shrink window
	        }
	    }

	    if (minLen == Integer.MAX_VALUE) {
	        System.out.println("No valid window found");
	    } else {
	        System.out.println(minLen + " " + s1.substring(ml, mr + 1));
	    }
	}
}
