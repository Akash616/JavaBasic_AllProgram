/*wap to find the factorial of the number.
5-> 5*4*3*2*1=120  
class Factorial
{
  public static void main(String[] args)
  {
    int no=5;
    int fact=1;
    for(int i=1; i<=no; i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of 5 is "+fact);
  }
}

OR
*/
import java.util.Scanner;
class Factorial
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number:");
    int no= s.nextInt();
    int fact=1;
    for(int i=no; i>=1; i--)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of "+no+" is "+fact);
  }
}

