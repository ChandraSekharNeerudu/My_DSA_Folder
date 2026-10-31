package corp.Strings;

public class Remove_openClosed_brackets {
	void main() {
		String s="{[()[]]{}}";
		System.err.println(remove(s)=="");
	}

	private String remove(String s) {
		while(s.contains("{}")||s.contains("[]")||s.contains("()"))
		{
			s=s.replace("{}", "");
			s=s.replace("[]", "");
			s=s.replace("()", "");
		}
		return s;
	}

}
