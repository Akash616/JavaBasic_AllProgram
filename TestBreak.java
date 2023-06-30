/*Labelled Break
  It is a control statement.

class TestBreak
{
   public static void main(String[] args)
   {
       int c=0;
       test:
       for(int k=0;k<5;k++)
       {
           for(int j=0;j<5;j++)
           {
               for(int i=0;i<5;i++)
               {
                    c++;
                    System.out.println("Hello world "+c+" times");
                    break test;
               }
           }
       }
   }
}
output
A:\javaprogram>javac TestBreak.java

A:\javaprogram>java TestBreak
Hello world 1 times

--------------------------------------------------------------------

class TestBreak
{
   public static void main(String[] args)
   {
       int c=0;
       
       for(int k=0;k<5;k++)
       {
           test:
           for(int j=0;j<5;j++)
           {
               for(int i=0;i<5;i++)
               {
                    c++;
                    System.out.println("Hello world "+c+" times");
                    break test;
               }
           }
       }
   }
}
output
A:\javaprogram>javac TestBreak.java

A:\javaprogram>java TestBreak
Hello world 1 times
Hello world 2 times
Hello world 3 times
Hello world 4 times
Hello world 5 times
______________________________________________________________________________
*/
class TestBreak
{
   public static void main(String[] args)
   {
       int c=0;
       
       for(int k=0;k<5;k++)
       {
          
           for(int j=0;j<5;j++)
           {
               test:
               for(int i=0;i<5;i++)
               {
                    c++;
                    System.out.println("Hello world "+c+" times");
                    break test;
               }
           }
       }
   }
}
output

A:\javaprogram>javac TestBreak.java

A:\javaprogram>java TestBreak
Hello world 1 times
Hello world 2 times
Hello world 3 times
Hello world 4 times
Hello world 5 times
Hello world 6 times
Hello world 7 times
Hello world 8 times
Hello world 9 times
Hello world 10 times
Hello world 11 times
Hello world 12 times
Hello world 13 times
Hello world 14 times
Hello world 15 times
Hello world 16 times
Hello world 17 times
Hello world 18 times
Hello world 19 times
Hello world 20 times
Hello world 21 times
Hello world 22 times
Hello world 23 times
Hello world 24 times
Hello world 25 times
