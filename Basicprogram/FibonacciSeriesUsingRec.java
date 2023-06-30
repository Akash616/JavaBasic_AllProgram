/*wap to print fibonacci series using recursion.
class FibonacciSeriesUsingRec
{
   public static void main(String[] args)
   {
         FibonacciSeriesUsingRec ob=new FibonacciSeriesUsingRec();
         ob.printFib();
   }
   void printFib()     
   {
         printFib();   //this line give recursion.
   }
}
----------------------------------------------------------------------------------------
*/
class FibonacciSeriesUsingRec
{
   static int a=0,b=1,c;
   public static void main(String[] args)
   {
         System.out.print(a+" "+b);
         FibonacciSeriesUsingRec ob=new FibonacciSeriesUsingRec();
         ob.printFib(20);   
   }
   void printFib(int i)     
   {
         if(i>=1)
         {
               c=a+b;
               System.out.print(" "+c);
               a=b;
               b=c;
               printFib(i-1);
         }   
   }
}