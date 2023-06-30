/*wap to print fibonacci series.
fibonacci:- previous 2 numbers ka sum hota hai.
0 1 1 2 3 5 8 13-------------
0 1 is fixed.
fibonacci series use swapping concept.
*/

class FibonacciSeries
{
    public static void main(String[] args)
    {
       int a=0,b=1;
       System.out.print(a+" "+b);
       int c;
       for(int i=1;i<=10;i++)
       {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
       }
    }
}


