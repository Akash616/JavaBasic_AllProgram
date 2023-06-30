class Palindrome
{
   public static void main(String[] a)
   {
       int n=Integer.parseInt(a[0]);
       int t=n;
       int rev=0,rem;
       while(t > 0)    // while(t != 0)
       {
            rem=t%10;
            rev=rev*10+rem;
            t=t/10;          
       }
       if(n==rev)
       {
            System.out.println("It is a palindrome number");
       }
       else
       {
            System.out.println("It is not a palindrome number");
       }
   }
}