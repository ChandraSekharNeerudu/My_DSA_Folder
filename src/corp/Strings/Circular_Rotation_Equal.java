package corp.Strings;

public class Circular_Rotation_Equal {
	void main() {
		String s1="abcde";
		String s2="cdeab";
		System.out.println(isRotationEqual(s1,s2));
	}

	private boolean isRotationEqual(String s1, String s2) {
		String alls1=s1+s1;
		
		return alls1.contains(s2);
	}
}
