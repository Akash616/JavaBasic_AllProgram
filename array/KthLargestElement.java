//wap to find Kth largest elements in an array.
class KthLargestElement
{
    public static void main(String[] args)
	{
	    int[] a=new int[]{5,8,12,7,6,2,4,10,21,33};
		int k=4;    //4 is index value.
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] < a[j])  //descending order
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i == k-1)
			{
				System.out.println(k+" largest element is "+a[i]);
				break;
			}
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
}
/*
output
A:\javaprogram\array>java KthLargestElement
4 largest element is 10
33 21 12 10 5 2 4 6 7 8
*/