package corp.Backtracking;
import java.util.*;
public class AllSubArrays {
	void main() {
		int[] arr= {1,2,3};
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> ss=new ArrayList<>();
		allSubArr(0,arr,ss,list);//here 0 is the call number
		System.out.println(list);
	}

	private void allSubArr(int i, int[] arr, List<Integer> ss, List<List<Integer>> list) {
		if(i==arr.length)//number of calls = length(3)
		{
			list.add(new ArrayList<>(ss));
			return;
		}
		ss.add(arr[i]);
		allSubArr(i+1,arr,ss,list);
		ss.remove(ss.size()-1);
		allSubArr(i+1,arr,ss,list);
	}

	
}
