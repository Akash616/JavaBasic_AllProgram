//print the number of odd and even in an array.
//sum and count of even or odd number in an array.
import java.util.ArrayList;
class EvenOddNumber
{
   public static void main(String[] args)
   {
       int[] a=new int[]{8,5,10,12,3,1,4};
	   ArrayList<Integer> al1=new ArrayList<>();    //even
	   ArrayList<Integer> al2=new ArrayList<>();    //odd
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2 == 0)
		   {
			   al1.add(a[i]);
			   //al1.clear();   -> it removes all of the elements from the list.
		   }
		   else
		   {
			   al2.add(a[i]);
		   }
	   }
	   int sum1=0;
	   System.out.println("Even numbers are ");
	   for(int no: al1)
	   {
		   sum1=sum1+no;
		   System.out.print(no+" ");
	   }
	   System.out.println("\nSum of all even numbers are "+sum1);
	   System.out.println("Total even numbers are "+al1.size());
	   System.out.println("-----------------------------------------");
	   int sum2=0;
	   System.out.println("Odd numbers are ");
	   for(int no:al2)
	   {
		   sum2=sum2+no;
		   System.out.print(no+" ");
	   }
	   System.out.println("\nSum of all odd numbers are "+sum2);
	   System.out.println("Total odd numbers are "+al2.size());
   }
}
/*   output
A:\javaprogram\array>java EvenOddNumber
Even numbers are
8 10 12 4
Sum of all even numbers are 34
Total even numbers are 4
-----------------------------------------
Odd numbers are
5 3 1
Sum of all odd numbers are 9
Total odd numbers are 3
*/