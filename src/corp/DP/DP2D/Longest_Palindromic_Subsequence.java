package corp.DP.DP2D;

public class Longest_Palindromic_Subsequence {
	void main() {
		String s="bcacadc";
		StringBuilder sb=new StringBuilder(s);
		/*reverse the current string and find Longest common subsequence
		 * that will be our longest palindromic subsequence
		 */
		String s2=sb.reverse().toString();
		Longest_Common_Subsequence obj=new Longest_Common_Subsequence();
		System.out.println(obj.check1(s.length()-1, s2.length()-1, s, s2));
		
	}
}
