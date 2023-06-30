
class Factorial
{
    public static void main(String[] a)
    {
         int n=Integer.parseInt(a[0]);
         int fact=1;
         for(int i=1;i<=n;i++)
         {
             fact=fact*i;
             
         }
         System.out.println("factorial of "+n+" is "+fact);
    }
}

/*

class Factorial
{
    public static void main(String[] a)
    {
         int n=Integer.parseInt(a[0]);
         int fact=1;
         while(n>0)
         {
             fact=fact*n;
             n--; 
         }
         System.out.println("factorial of "+n+" is "+fact);
    }
}

*/