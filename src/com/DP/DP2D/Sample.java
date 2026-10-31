package com.DP.DP2D;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};
		System.out.println(findSubstring(s, words));
	}
	public static  List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list=new ArrayList<>();
        int w=words[0].length();
        if(w==0||s.length()==0)return list;

        Map<String,Integer> map1=new HashMap<>();
        for(String s1:words)map1.put(s1,map1.getOrDefault(s1,0)+1);

        int count=0;
        for(int i=0;i<w;i++){
            String cs="";
            cs=s.substring(i,i+w);
            if(map1.containsKey(cs))count++;
            
            for(int j=i+w;j+w<s.length();j=j+w){
            	
            	cs=s.substring(j,j+w);
                if(map1.containsKey(cs)){
                    count++;
                    if(count==words.length){
                        list.add(j-w);
                        count=0;
                    }
                }
                else count=0;
        }
    }
    return list;
    }
	 
}
