package corp.Backtracking;

import java.util.*;

public class Phone_KeyPad_combinations {
	void main() {
		int[] arr= {2,3};
		findComb(arr);
		findComb2();
	}

	public static void findComb2() {
		String digitstr="23";
		Map<Character,String> map=new HashMap<>();
		map.put('2',"abc");map.put('3',"def");map.put('4',"ghi");
		map.put('5',"jkl");map.put('6',"mno");map.put('7',"pqrs");
		map.put('8',"tuv");map.put('9',"wxyz");
		
		System.out.println(keyPad("",digitstr,map));
	}
	public static List<String> keyPad(String p,String up,Map<Character,String> map)
	{
	    if(up.isEmpty())
	    {
	        List<String> list=new ArrayList<>();
	        list.add(p);
	        return list;
	    }
	    
	    List<String> all=new ArrayList<>();
	    //int d='0'-up.charAt(0);if(d>2 && d<10)
	    String s=map.get(up.charAt(0));
	    for(int i=0;i<s.length();i++)
	    {
	        all.addAll(keyPad(p+s.charAt(i),up.substring(1),map));
	    }
	    return all;
	}
	private void findComb(int[] arr) {
		String[] strarr= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		int n=arr.length;
		List<String> res=new ArrayList<>();
		allComb(0,n,arr,strarr,"",res);
		System.out.println(res);
	}

	private void allComb(int ind, int n,int[] arr, String[] strarr, String str, List<String> res) {
		if(ind==n)
		{
			res.add(new String(str));
			return;
		}
		int d=arr[ind];
		if(d<2 || d>9)
		{
			allComb(ind+1,n,arr,strarr,str,res);
			return ;
		}
		int l=strarr[d].length();
		for(int i=0;i<l;i++)
		{
			str+=strarr[d].charAt(i);
			allComb(ind+1,n,arr,strarr,str,res);
			str=str.substring(0,str.length()-1);
		}
	}

	
}
