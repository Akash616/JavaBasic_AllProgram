//Implementing thread by implements Runnable interface.
//Runnable interface belongs to java.lang package.
//Runnable interface has only one method (public abstract void run();).

class TestRunnable implements java.lang.Runnable
{
     public void run()
     {
           for(int i=0;i<=5;i++)
           System.out.println("job of child thread "+i);
     }
}
class RunnableThread
{
     public static void main(String[] args) 
     {
          TestRunnable r=new TestRunnable();
          //Thread t=new Thread(); -->no error,output comes main thread 1 to 5.
          Thread t=new Thread(r);
          t.start();
          
          for(int i=0;i<=5;i++)
          System.out.println("job of main thread "+i);
     }
}