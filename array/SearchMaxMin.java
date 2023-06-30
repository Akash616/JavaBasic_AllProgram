/* Wap to find the maximum and minimum value in an array.
class SearchMaxMin
{
    public static void main(String[] args)
	{
		int[] a=new int[]{4,3,5,2,8,1,6};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
			if(max < a[i])
			{
				max=a[i];
			}
			if(min > a[i])
			{
				min=a[i];
			}
		}
        System.out.println("Maximum element is "+max);
		System.out.println("Minimum element is "+min);
	}
}

output:-
A:\javaprogram\array>java SearchMaxMin
Maximum element is 8
Minimum element is 1
*/

//user input
import java.util.Scanner;
class SearchMaxMin
{
    public static void main(String[] args)
	{
		int[] a=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
			if(max < a[i])
			{
				max=a[i];
			}
			if(min > a[i])
			{
				min=a[i];
			}
		}
        System.out.println("Maximum element is "+max);
		System.out.println("Minimum element is "+min);
	}
}

/*
output
A:\javaprogram\array>java SearchMaxMin
Enter elements:
4
3
5
2
8
1
6
Maximum element is 8
Minimum element is 1
*/