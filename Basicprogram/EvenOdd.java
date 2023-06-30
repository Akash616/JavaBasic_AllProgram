/*wap to check for even or odd.
 eg:-   2 divide by 90 it gives 0 remainder.
        90/2 = 45 --> quotient
        90%2 = 0 ---> remainder
*/

class EvenOdd
{
  public static void main(String[] args)
  {
    int n=90;
    if(n % 2 == 0)
    {
       System.out.println("number is even");    
    }  
    else
    {
       System.out.println("number is odd");
    }
  }
}