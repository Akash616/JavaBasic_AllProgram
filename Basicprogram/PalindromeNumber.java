/*wap to check for palindrome number.
palindrome number:- number reverse karna ka baad bhi number same ho.
eg:- 121 -> 121.
logic:- reverse a number.

class PalindromeNumber
{
   public static void main(String args[])
   {
         int no=121;
         int temp=no;
         int rem,rev=0;
         while(temp != 0)    //temp is not equals to 0.
         {
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
         }
         if(no==rev)
         {
                System.out.println(no+" is a palindrome number");
         }
         else
         {
                System.out.println(no+" is not a palindrome number");
         }
   }
}
--------------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;
class PalindromeNumber
{
   public static void main(String args[])
   {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number:");
         int no= s.nextInt();
         int temp=no;
         int rem,rev=0;
         while(temp != 0)    //temp is not equals to 0.
         {
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
         }
         if(no==rev)
         {
                System.out.println(no+" is a palindrome number");
         }
         else
         {
                System.out.println(no+" is not a palindrome number");
         }
   }
}