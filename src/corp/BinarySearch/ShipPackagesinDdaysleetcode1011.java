package corp.BinarySearch;

public class ShipPackagesinDdaysleetcode1011 {
	
//Binary Search on Answer
	void main()
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int days=5;
		minShipCapactyPerDay(arr,days);
	}

	private void minShipCapactyPerDay(int[] arr, int days) {
		// TODO Auto-generated method stub
		int sum=0;
		int low=arr[0];//max from the array
		for(int i:arr)
		{
			sum+=i;
			low=Math.max(low, i);
		}
		int high=sum;
		int mindays=high;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			
			if(calculateDaystoShip(arr,mid)<=days)
			{
				mindays=mid;
				high=mid-1;//ippdu manaki 5 kanna thakkuva days dhorikindhanyko manam mid ew ni thaggisthunnam by moving left so that he number days get increased and manaki given days dhaggaraga or equal vunna value find avuthundhi
			}else low=mid+1;
		}
		System.out.println(mindays);
	}

	private int calculateDaystoShip(int[] arr, int mid) {
		int days=0;
		int curshipcapacity=0;
		for(int i:arr)
		{
			curshipcapacity+=i;
			if(curshipcapacity>mid)
			{
				curshipcapacity=i;
				days++;
			}
		}
		days++;
		return days;
	}
}
