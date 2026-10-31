package corp.Backtracking;

public class Fibbonacci {
	void main() {
		int n=6;
		int res=fibb(n);
		System.out.println(res);
	}

	private int fibb(int n) {
		if(n<=1)
		{
			return n;
		}
		int cur=fibb(n-1)+fibb(n-2);
		
		return cur;
	}
}
