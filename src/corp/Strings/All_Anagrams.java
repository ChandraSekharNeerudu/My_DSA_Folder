package corp.Strings;
import java.util.*;
public class All_Anagrams {
	public static void main(String[] args) {
		   String str="cbaebabacd";
		   String p="abc";
		   System.out.println(anagrams(str,p));
		}
		public static List<Integer> anagrams(String str,String p)
		{
		    List<Integer> list=new ArrayList<>();
		    int k=p.length();
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<k;i++)
		    {
		        sb.append(str.charAt(i));
		    }
		    if(isAnagrams(sb.toString(),p))
		    {
		        list.add(0);
		    }
		    for(int i=k;i<str.length();i++)
		    {
		        sb.deleteCharAt(0);
		        sb.append(str.charAt(i));
		        if(isAnagrams(sb.toString(),p))
		        {
		            list.add(i-k+1);
		        }
		    }
		    return list;
		}
		
		public static boolean isAnagrams(String s1,String s2)
		{
		    char[] c1=s1.toCharArray();
		    char[] c2=s2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    s1=String.valueOf(c1);
		    s2=String.valueOf(c2);
		    return s1.equals(s2);
		}
}
