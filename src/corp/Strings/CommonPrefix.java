package corp.Strings;

public class CommonPrefix {
	void main() {
		String[] strarr= {"flower","flow","flight"};
		System.out.println(comPre(strarr));
	}

	private String comPre(String[] strarr) {
		StringBuilder pre=new StringBuilder();
		int min=strarr[0].length();
		for(String str:strarr)
			min=Math.min(min, str.length());
		for(int i=0;i<min;i++) {
			for(int j=0;j<strarr.length-1;j++) {
				if(strarr[j].charAt(i)!=strarr[j+1].charAt(i))
					return pre.toString();
			}
			pre.append(strarr[0].charAt(i));
		}
		return pre.toString();
	}
}
