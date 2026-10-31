package corp.BinarySearch;

public class Sqrt {
	void main() {
		int n=1;
		System.out.println(findSqrt(n));
	}

	private int findSqrt(int n) {
		int res=0;
		int l=0;int r=n;
		while(l<=r) {
			int m=l+(r-l)/2;
			if(m*m==n) {
				return m;
			}else if(m*m < n) {
				res=m;
				l=m+1;
			}else r=m-1;
		}
		return res;
	}
}
