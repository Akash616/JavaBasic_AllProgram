/*wap to find the factorial of the number using recursion.
recursion:-vo method hota hai jo apna aap ko baar baar call karta rahta hai. 
eg:- m1()
     {
        ----- //body
        -----
         m1();
     }

class FactorialByRecursion
{
  static int fact=1;
  public static void main(String[] args)
  {
     int no=5;
     FactorialByRecursion ob=new FactorialByRecursion();
     ob.calcFact(no);
     System.out.println("Factorial of "+no+" is:"+fact);
  }
  void calcFact(int no)
  { 
     if(no>=1)
     {
        fact=fact*no;
        calcFact(no-1);
     }
  }
}

----------------------------------------------------------------------

class FactorialByRecursion
{
  int fact=1;
  public static void main(String[] args)
  {
     int no=5,res;
     FactorialByRecursion ob=new FactorialByRecursion();
     res=ob.calcFact(no);
     System.out.println("Factorial of "+no+" is:"+res);
  }
  int calcFact(int no)
  { 
     if(no>=1)
     {
        fact=fact*no;
        calcFact(no-1);
     }
     return fact;
   }
}

-------------------------------------------------------------------------

import java.util.Scanner;
class FactorialByRecursion
{
  int fact=1;
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number:");
     int no= s.nextInt();
     int res;
     FactorialByRecursion ob=new FactorialByRecursion();
     res=ob.calcFact(no);
     System.out.println("Factorial of "+no+" is:"+res);
  }
  int calcFact(int no)
  { 
     if(no>=1)
     {
        fact=fact*no;
        calcFact(no-1);
     }
     return fact;
   }
}
-----------------------------------------------------------------------------
*/

import java.util.Scanner;
class FactorialByRecursion
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number:");
     int no= s.nextInt();
     int fact;
     FactorialByRecursion ob=new FactorialByRecursion();
     fact=ob.calcFact(no);
     System.out.println("Factorial of "+no+" is:"+fact);
  }
  int calcFact(int no)
  { 
     if(no>=1)
     {
        return (no*calcFact(no-1));
     }
     return 1;
   }
}