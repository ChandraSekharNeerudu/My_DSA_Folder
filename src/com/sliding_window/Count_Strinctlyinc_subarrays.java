package com.sliding_window;

public class Count_Strinctlyinc_subarrays {
	int count(int[] arr, int k) {// no need of k
		int count = 0;
		int l = 0, r = 0;
		
		while (l < arr.length-1) {//1, 4, 5,6, 7, 9
			r=l+1;
			while (r < arr.length && arr[r - 1] < arr[r]) {
				if (r - l >= k - 1)// manaku exact strictly inc window of given length find ayindhi
				{
					count++;
				}
				r++;
			}
			
			if(r-1-l>k-1)//bcz r-1 is the  end index of the prev currect window
			{
				l++;
			}
			else
			{
				l=r;
			}

		}
		return count;
	}
	
	                                      //optimized
	int Optimized(int[] arr,int k)
	{
		 
       
        int count = 0;
        int len = 1;
        
        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            
            // If current element is greater than 
            // previous, increase len
            if (arr[i] > arr[i - 1]) {
                len++;
            } 
            
            else {
            	if (len >= k) {
                    int n = len - k + 1;
                    count += (n * (n + 1)) / 2;
                }
                // Add subarrays count and reset len
            	// count += (len * (len - 1)) / 2;
                len = 1;
            }
        }

        // Add remaining subarrays count
     // Process the last segment
        if (len >= k) {
            int m = len - k + 1;
            count += (m * (m + 1)) / 2;
        }


        return count;
	}
	void main()
	{
		int[] arr= {1, 4, 5,3, 7, 9};//{0,0,0,0,0};//{1, 3, 3, 2, 3, 5};
		System.out.println(Optimized(arr,2));/*output:6 bcz (1,4)(1,4,5)(4,5)(3,7)(3,7,9)(7,9)*/
	}

}
