//wap to find the duplicate values of an array
// Brute Force method   :- But time Consuming
//disadvantage:- 1. time   2. repeat print those elmenets who are already printed.
class FindDuplicateElement
{
    public static void main(String[] args)
	{
	      int[] a=new int[]{3,5,4,3,2,2,1};
		  int temp=0;
		  System.out.println("Duplicate values are: ");
		  for(int i=0;i<a.length-1;i++)
		  {
			  for(int j=0;j<a.length;j++)
			  {
				  if((a[i] == a[j]) && (i!=j))
				  {
					  System.out.print(a[j]+" ");
					  temp=temp+1;
				  }
			  }
		  }
		  if(temp == 0)
		  System.out.print("nothing");
	}
}

/*
output
A:\javaprogram\array>java FindDuplicateElement
Duplicate values are:
3 3 2 2         //2. disadvantage
*/