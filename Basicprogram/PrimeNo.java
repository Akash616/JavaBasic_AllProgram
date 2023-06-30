/*wap to check wheather a number is prime or not.
prime number:- jo 1 say or itself say hi divide hota hai.
eg:- 7 is a prime number because 7 is divisible by 1 and 7 only.
     9 is not a prime number because 9 is divisible by 1 , 3 and 9.
     .) 7-> 1 - 7
        ---------- 
        2,3,4,5,6 -> jo no 2,3,4,5,6 say divide ho jay vo prime number nahi hai.

class PrimeNo
{
  public static void main(String[] args)
  {
     int no=7;
     int temp=0;
     for(int i=2;i<=no-1;i++)
     {
           if(no%i == 0)                //agar hum yaha par else condition likha ga toh for loop baar baar print karta rahaga.
           {
                temp=temp+1;            
           }
     }
     if(temp==0)
     {
          System.out.println(no+" is prime no");
     }
     else
     {
          System.out.println(no+" is not prime no");
     }
  }
-------------------------------------------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;
class PrimeNo
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number:");
     int no= s.nextInt();
     int temp=0;
     for(int i=2;i<=no-1;i++)
     {
           if(no%i == 0)                //agar hum yaha par else condition likha ga toh for loop baar baar print karta rahaga.
           {
                temp=temp+1;            
           }
     }
     if(temp==0)
     {
          System.out.println(no+" is prime no");
     }
     else
     {
          System.out.println(no+" is not prime no");
     }
  }
}