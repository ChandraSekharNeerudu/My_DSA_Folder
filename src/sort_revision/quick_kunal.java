package sort_revision;

import java.util.Arrays;

public class quick_kunal {
	static void sort(int[] arr,int l,int h)
	{
		if(l>=h)
		{
			return;
		}
		int mid=l+(h-l)/2;
		int s=l,e=h;
		int pivote=arr[mid];
		while(s<=e)
		{
			while(arr[s]<pivote)
			{
				s++;
			}
			while(arr[e]>pivote)
			{
				e--;
			}
			if(s<=e)
			{
				swap(arr,s,e);
				s++;
				e--;
			}
		}
		sort(arr,l,e);
		sort(arr,s,h);
	}
	// --- 3. Helper and Main Methods ---
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
    	int[] arr= {9,2,7,2,3,6};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	

}
