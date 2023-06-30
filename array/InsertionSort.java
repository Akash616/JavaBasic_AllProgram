class InsertionSort
{
     public static void main(String[] args)
	 {
		int[] a=new int[]{5,1,6,2,4,3};
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	 }
}

/*output
A:\javaprogram\array>javac InsertionSort.java

A:\javaprogram\array>java InsertionSort
1 2 3 4 5 6
*/