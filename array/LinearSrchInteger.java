// Searching algorithm.
/*class LinearSrchInteger
{
    public static void main(String[] args)
    {
		int[] a=new int[]{5,3,6,1,4,2};
		int item=1;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == item)
			{
				System.out.println("Item is present at "+i+" index position");
				temp=temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println("Item is not found in list");
		}
	}	
}
  output
A:\javaprogram\array>java LinearSrchInteger
Item is present at 3 index position
*/
// user input
import java.util.Scanner;
class LinearSrchInteger
{
    public static void main(String[] args)
    {
		int[] a=new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter element you want to search :");
		int item=sc.nextInt();
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == item)
			{
				System.out.println("Item is present at "+i+" index position");
				temp=temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println("Item is not found in list");
		}
	}	
}
/* output
Enter elements:
5
3
6
1
4
2
enter element you want to search :
1
Item is present at 3 index position

*/