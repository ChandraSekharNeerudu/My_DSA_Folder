package corp.Backtracking_maze2D;

import java.util.ArrayList;
import java.util.List;

public class Array_Perms {
	void main() {
		System.out.println(permute(new int[] {1,2,3}));
		System.out.println(permute2(new int[] {4,5,6}));
	}
	//one way
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> curl=new ArrayList<>();
        getPerms(0,curl,nums,list);
        return list;
    }
    
    public void getPerms(int ind,List<Integer> curl,int[] nums,List<List<Integer>> list)
    {
        if(ind==nums.length){
            list.add(new ArrayList<>(curl));
            return;
        }

        for(int i=0;i<=curl.size();i++){
            curl.add(i,nums[ind]);
            getPerms(ind+1,curl,nums,list);
            curl.remove(i);
        }
    }
    
    // my way
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(0, nums, result);
        return result;
    }

    private void generatePermutations(int index, int[] nums, List<List<Integer>> result) {
        // Base case: if index reaches the end, we have a complete permutation
        if (index == nums.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            result.add(current);
            return;
        }

        // Try every possible element at the current index position
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i); // Make the choice
            generatePermutations(index + 1, nums, result); // Explore further
            swap(nums, index, i); // Backtrack (undo the choice)
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
