package com.Strings;

public class Panagram {
	 static boolean isPanagram(String s)
	    {
	        if(s.length()<26) return false;
	        
	        int[] alpha=new int[26];
	        s=s.toLowerCase().trim();
	        int uniquechar=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(!Character.isLetter(s.charAt(i))) continue;
	            int charIndex=s.charAt(i)-'a';
	            if(alpha[charIndex]==0)
	            {
	                uniquechar++;
	            }
	            alpha[charIndex]++;
	            if(uniquechar>=26)
	            {
	                return true;
	            }
	        }
	        
	        return false;
	    }
	
	                                                       // OPTIMIZED //
	public boolean isPangramOptimal(String s) {
	    int mark = 0; // Each bit represents a letter a-z
	    int count = 0;

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c >= 'a' && c <= 'z') {
	            int index = c - 'a';
	            // Check if this bit is already set
	            if ((mark & (1 << index)) == 0) {
	                mark |= (1 << index); // Set the bit
	                count++;
	            }
	        } else if (c >= 'A' && c <= 'Z') {
	            int index = c - 'A';
	            if ((mark & (1 << index)) == 0) {
	                mark |= (1 << index);
	                count++;
	            }
	        }
	        
	        // Optimization: If all 26 letters are found, stop early
	        if (count == 26) return true;
	    }
	    return false;
	}
	
	public void main() {
		String s="The quick brown fox jumps over the lazy dog" ;
		
		System.out.println(isPanagram(s));
	}

}
