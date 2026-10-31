package corp.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_ofN_nowith_k_Leangth {
	void main() {
		int n=4;
		int k=2;
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		SequenceSubOfkLeangth(1,n,k,list,res);
		System.out.println(res);
	}

	private void SequenceSubOfkLeangth(int s, int n, int k, List<Integer> list, List<List<Integer>> res) {
		if(list.size()==k)
		{
			res.add(new ArrayList<>(list));
			return;
		}
		for(int i=s;i<=n;i++)
		{
			list.add(i);
			SequenceSubOfkLeangth(i+1,n,k,list,res);
			list.remove(list.size()-1);
		}
	}
}
