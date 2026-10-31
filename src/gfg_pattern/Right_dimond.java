package gfg_pattern;

public class Right_dimond {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == i || j < i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {        
				
				if (i + j <= (5 - 1)) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
