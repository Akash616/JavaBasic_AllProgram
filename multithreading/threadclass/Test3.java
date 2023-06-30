//overload rum method

class Test3 extends Thread
{
      public void run()
      {
         for(int i=0;i<=10;i++)
         System.out.println("child thread "+i);
         run(2);  //call explicitly
      }
      public void run(int a)
      {
         for(int i=0;i<=10;i++)
         System.out.println("child thread 2 "+i);
      }
}
class TestThread3
{
      public static void main(String[] args)
      {
            Test3 t=new Test3();
            t.start();     

            for(int i=0;i<=10;i++)
            System.out.println("main thread "+i);
      }
}