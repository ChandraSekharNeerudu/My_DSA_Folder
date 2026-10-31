package corp.Backtracking;
import java.util.*;
public class Permutations {
	void main()
	{
		String s="ABC";
		int n=s.length();
		List<String> list=new ArrayList<>();
		permutation(s,"",n,list);
		System.out.println(list);
	}

	private void permutation(String s, String cs, int n, List<String> list) {
		if(cs.length()==n)
		{
			list.add(cs);
			return;
		} 
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String str=s.substring(0,i)+s.substring(i+1);
			permutation(str,cs+ch,n,list);
		}
		
	}
}
