package corp.Recursion;

public class Basic {
	public static void main(String[] args) {
		int n=8;
		int ans=stepsToReduceZero(0,n);
		System.out.println(ans);
	}
	public static int stepsToReduceZero(int s,int n)
	{
	    if(n==0)return s;
	    
	    if(n%2==0){
	        s++;
	        return stepsToReduceZero(s,n/2);
	    }else{
	        s++;
	        return stepsToReduceZero(s,n-1);
	    }
	}
	public static int reverse(int rev,int n)
	{
	    if(n==0)return rev;
	    rev=(rev*10)+(n%10);
	    return reverse(rev,n/10);
	}
	public static int sumDigits(int n)
	{
	    if(n==0){
	        return 0;
	    }
	    int last=n%10;
	    return last+sumDigits(n/10);
	}
	public static int fact(int n)
	{
	    if(n<=1) return 1;
	    return n*fact(n-1);
	}
}
