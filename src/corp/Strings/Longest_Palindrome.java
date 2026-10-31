package corp.Strings;

public class Longest_Palindrome {
	void main() {
		String s="abcacbnea";
		System.out.println(longestPalindrome(s));
	}

	private String longestPalindrome(String s) {
		int n=s.length();
		int ml=0;
		int mr=0;
		int maxlength=0;
		for(int i=0;i<n;i++) {
			int l=i;int r=i;//even length
			while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)) {
				if(r-l+1>maxlength)
				{
					maxlength=r-l+1;
					ml=l;
					mr=r;
				}
				l--;
				r++;
			}
			
			l=i; r=i+1;//odd length
			while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)) {
				if(r-l+1>maxlength)
				{
					maxlength=r-l+1;
					ml=l;
					mr=r;
				}
				l--;
				r++;
			}
			
			
		}
		return s.substring(ml,mr+1);
	}

}
