package corp.Strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class Remove_Identical_sequential_Chars {
	void main() {
		String s="azxxzy";
		System.out.println(usingStack(s));
	}

	private String usingStack(String s) {
		Deque<Character> stack=new ArrayDeque<>();
		stack.add(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==stack.peekLast()) {
				stack.removeLast();
			}
			else stack.addLast(s.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		int n=stack.size();
		for(int i=0;i<n;i++)
		{
			sb.append(stack.pollFirst());
		}
		return sb.toString();
	}
}
