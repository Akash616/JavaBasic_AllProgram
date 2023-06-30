/*difference between break and continue

class TestContinue
{
    public static void main(String[] args)
    {
         for(int i=0;i<=5;i++)
         {
              if(i==2)
              {
                  continue;
              }
              System.out.println("Hello world "+i+" times");
         }
         System.out.println("out of for loop");
    }
}
output
A:\javaprogram>javac  TestContinue.java

A:\javaprogram>java  TestContinue
Hello world 1 times
Hello world 3 times
Hello world 4 times
Hello world 5 times
out of for loop
----------------------------------------------------------------------------

class TestContinue
{
    public static void main(String[] args)
    {
         for(int i=1;i<=5;i++)
         {
              System.out.println("Hello world "+i+" times");
              break;
         }
         System.out.println("out of for loop");
    }
}
output

A:\javaprogram>java  TestContinue
Hello world 1 times
out of for loop

-------------------------*/

class TestContinue
{
    public static void main(String[] args)
    {
         for(int i=1;i<=5;i++)
         {
              System.out.println("Hello world "+i+" times");
              if(i==2)
              break;
         }
         System.out.println("out of for loop");
    }
}
output
A:\javaprogram>java  TestContinue
Hello world 1 times
Hello world 2 times
out of for loop