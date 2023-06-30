//find the missing number in an array.  ex:- 1,2,3,4,6  => 5 is missing
/*
class FindMissingNumber
{
    public static void main(String[] args)
	{
	    int[] a=new int[]{1,2,3,4,6};
		int expected_no_elem=a.length+1;
		int total_sum = expected_no_elem*(expected_no_elem+1)/2;   //21 predefine formula
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i]; //16
		}
		System.out.print("Missing number is "+(total_sum-sum));  //21-16=>5
	}
}
//Missing number is 5
class FindMissingNumber
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,3,4,6};
		int xor1=a[0];
		for(int i=1;i<a.length;i++)
		{
			xor1=xor1^a[i];
		}
		int xor2=1;
		for(int i=2;i<=6;i++)
		{
			xor2=xor2^i;
		}
		System.out.print("Missing number is "+(xor1 ^ xor2));
	}
}*/
//Missing number is 5
import java.util.Scanner;
class FindMissingNumber
{
	public static void main(String[] args)
	{
		int[] a=new int[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int xor1=a[0];
		for(int i=1;i<a.length;i++)
		{
			xor1=xor1^a[i];
		}
		
		int xor2=1;
		for(int i=2;i<=a.length+1;i++)
		{
			xor2=xor2^i;
		}
		System.out.print("Missing number is "+(xor1 ^ xor2));
	}
}
/*
output
Enter elements
1
2
3
4
5
6
8
9
Missing number is 7
*/





