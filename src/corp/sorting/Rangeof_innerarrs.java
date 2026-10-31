package corp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Rangeof_innerarrs {
	
	
	static void rangearr(int[][] arr)
	{
		//sorting using 1st element of each array
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		List<int[]> list=new ArrayList<>();
		list.add(new int[] {arr[0][0],arr[0][1]});
		for(int i=1;i<arr.length;i++) {
			int[] curr=arr[i];
			int last[]=list.get(list.size()-1);
			if(curr[0]<last[1]) {
				if(curr[1]>last[1]) {
					last[1]=curr[1];
				}
			}
			else list.add(new int[] {arr[i][0],arr[i][1]});
		}
		System.out.println(list);
	}
	void main() {
		int[][] arr= {{1,3},{2,4},{6,8},{9,10}};
		rangearr(arr);
	}
}
