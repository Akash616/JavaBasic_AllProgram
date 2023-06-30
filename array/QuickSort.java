class QuickSort
{
    public static void main(String[] args)
	{
	    int[] arr=new int[]{15,9,7,13,12,16,4,18,11};
		int leng=arr.length;
		QuickSort qsm=new QuickSort();
		qsm.quickSortRecursion(arr,0,leng-1);
		qsm.printArray(arr);
	}
	int partition(int[] arr,int low,int high)
	{
		int pivot=arr[(low+high)/2];    //12   //arr[low];
		while(low <= high)       // 0<=8
		{
			while(arr[low] < pivot)
			{
				low++;
			}
			while(arr[high] > pivot)
			{
				high--;
			}
			if(low <= high)  // 0<=8
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;    // low=index 4=>12
	}
	void quickSortRecursion(int[] arr,int low,int high)
	{
		int pi=partition(arr,low,high);
		
		if(low < pi-1)   //0<4-1=3 index
		{
			quickSortRecursion(arr,low,pi-1);
		}
		if(pi < high)   //4<8
		{
			quickSortRecursion(arr,pi,high);
		}
	}
	void printArray(int[] arr)
	{
		for(int x: arr)
		{
		   System.out.print(x+" ");
		}
	}
}
/*
A:\javaprogram\array>javac QuickSort.java

A:\javaprogram\array>java QuickSort
4 7 9 11 12 13 15 16 18
*/



















