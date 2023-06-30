class MergeSort
{
	int[] array;
	int[] tempMergeArr;
	int length;
    public static void main(String[] args)
	{
		int[] inputArr=new int[]{48,36,13,52,19,94,21};
		MergeSort ms=new MergeSort();
		ms.sort(inputArr);
		for(int x:inputArr)
		{
			System.out.print(x+" ");
		}
	}
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.length=inputArr.length;   //7
		this.tempMergeArr=new int[length];      //temporary array  :- creation of array only not initilazation.
		divideArray(0,length-1);
	}
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;      //3
			// it will sort the left side of an array
			divideArray(lowerIndex,middle);
			// it will sort the right side of an array
			divideArray(middle+1,higherIndex);
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	public void mergeArray(int lowerIndex,int middle,int higherIndex)
	{
	    for(int i=lowerIndex;i<=higherIndex;i++)
        {
			tempMergeArr[i]=array[i];
		}	
        int i=lowerIndex;         //i=0(because lowerIndex=0)
        int j=middle+1;           //j=4(because middle=3)
        int k=lowerIndex;         //k=0(because lowerIndex=0)
		
        while(i<=middle && j<=higherIndex)
        {
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
        while(i<=middle)
        {
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}			
	}
}

/*
output
A:\javaprogram\array>javac MergeSort.java

A:\javaprogram\array>java MergeSort
13 19 21 36 48 52 94
*/


















