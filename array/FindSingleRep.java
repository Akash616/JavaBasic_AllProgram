/*Find the element that appears once in an array where every other element appears twice in java.
   by using XOR (^)*/
   
class  FindSingleRep
{
    public static void main(String[] args)
	{
	     int[] a=new int[]{5,3,4,5,2,3,4};
		 int res=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 res= res ^ a[i];      //res=5^3^4^5^2^3^4  => 0^0^0^2 
		 }
		 System.out.print("Single repeated element is "+res);
	}
} 

/*
output
A:\javaprogram\array>java FindSingleRep
Single repeated element is 2
*/