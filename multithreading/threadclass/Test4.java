//overriding start method but not achieveing multithreading.

class Test4 extends Thread
{
      public void run()
      {
         for(int i=0;i<=10;i++)
         System.out.println("child thread "+i);
         
      }
      public void start()
      {
          System.out.println("our start method will invoke like a normal method");
          run();
      }
}
class TestThread4
{
      public static void main(String[] args)
      {
            Test4 t=new Test4();
            t.start();     

            for(int i=0;i<=10;i++)
            System.out.println("main thread "+i);
      }
}