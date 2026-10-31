package corp.Strings;
import java.util.*;
public class GroupAnagrams {
	public List<List<String>> group(String[] arr)
	{
		Map<String,List<String>> map=new HashMap<>();
		for(String str:arr)
		{
			char[] chars=str.toCharArray();
			Arrays.sort(chars);
			String sortedKey=String.valueOf(chars);
			map.putIfAbsent(sortedKey, new ArrayList<String>());
			
			map.get(sortedKey).add(str);
		}
		return new ArrayList<>(map.values());
	}
	void main()
	{
		String[] input = {"cat", "tea", "tac", "eat", "net", "ate", "ten", "run"};
		List<List<String>> list=group(input);
		for(List<String> l:list)
		{
			System.out.println(String.join(",", l));
		}
	}
}
