//Start Vs Run

class Test1 extends Thread
{
      public void run()
      {
          for(int i=0;i<=10;i++)
          System.out.println("child thread "+i);
      }
}
class TestThread1
{
      public static void main(String[] args)
      {
            Test1 t=new Test1();
            //t.start();  ->output not judge
              t.run();    ->output judge but not achieve multithreading

            
            for(int i=0;i<=10;i++)
            System.out.println("main thread "+i);
      }
}