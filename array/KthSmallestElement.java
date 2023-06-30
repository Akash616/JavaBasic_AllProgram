//wap to find Kth Smallest elements in an array.
class KthSmallestElement
{
    public static void main(String[] args)
	{
	    int[] a=new int[]{5,12,7,6,2,4,10,21,33};
		int k=4;    //4 is index value.
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])    //ascending order
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i == k-1)
			{
				System.out.println(k+" smallest element is "+a[i]);
				break;
			}
		}
		for(int i=0;i<a.length;i++)
	    {
			System.out.print(a[i]+" ");
		}
	}
}
/*
output
A:\javaprogram\array>java KthSmallestElement
4 smallest element is 6
2 4 5 6 12 7 10 21 33
*/