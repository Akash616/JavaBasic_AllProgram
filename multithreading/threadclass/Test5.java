//overriding start method and achieveing multithreading.

class Test5 extends Thread
{
      public void run()
      {
         for(int i=0;i<=10;i++)
         System.out.println("child thread "+i);
         
      }
      public void start()
      {
          super.start();
          System.out.println("our start method will invoke like a normal method");
         
      }
}
class TestThread5
{
      public static void main(String[] args)
      {
            Test5 t=new Test5();
            t.start();     

            for(int i=0;i<=10;i++)
            System.out.println("main thread "+i);
      }
}