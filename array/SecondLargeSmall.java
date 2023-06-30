//wap to find the Second largest and smallest elements in an arary.
class SecondLargeSmall
{
     public static void main(String[] args)
	 {
		 int[] a=new int[]{6,8,2,4,3,1,5,7,9};
		 
		 for(int i=0;i<a.length;i++)    
	     {
			for(int j=i+1;j<a.length;j++)
			{
				 if(a[i] < a[j])    //second largest :- Descending order
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			}
		 }
		 System.out.println("Second largest element is "+a[1]);
		 for(int x:a)
		 {
			 System.out.print(x+" ");
		 }
		 System.out.println();
		 System.out.println("-------------------------------");
		 for(int i=0;i<a.length;i++)    
	     {
			for(int j=i+1;j<a.length;j++)
			{
				 if(a[i] > a[j])    //second smallest :- ascending order
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			}
		 }
		 System.out.println("Second largest element is "+a[1]);
		 for(int x:a)
		 {
			 System.out.print(x+" ");
		 }
	 }
}
/*
output
A:\javaprogram\array>java SecondLargeSmall
Second largest element is 8
9 8 7 6 5 4 3 2 1
-------------------------------
Second largest element is 2
1 2 3 4 5 6 7 8 9
*/