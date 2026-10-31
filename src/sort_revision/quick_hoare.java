package sort_revision;

import java.util.Arrays;

public class quick_hoare {
	static void sort(int[] arr,int l,int h)
	{
		if(l>=h)
		{
			return;
		}
		int p=hoare(arr,l,h);
		sort(arr,l,p);
		sort(arr,p+1,h);
	}
	static int hoare(int[] arr,int l,int h)
	{
		
		int pivote=arr[l];
		int s=l,e=h;
		while(s<e)
		{
			while(arr[s]<pivote)
			{
				s++;
			}
			while(arr[e]>pivote)
			{
				e--;
			}
			if(s<e)
			{
				swap(arr,s,e);
			}
		}
		return e;
	}
	 // --- 3. Helper and Main Methods ---
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
		int[] arr= {5,8,2,3,1};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
