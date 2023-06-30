//If you want to set priority of thread.

class A1 extends Thread
{
      public void run()
      {
           System.out.println("child thread priority "+Thread.currentThread().getPriority());
      }
}
class TestPriority1
{
    public static void main(String[] args)
    {
         A1 t1=new A1();
         t1.start();
         t1.setPriority(3);

         System.out.println("main thread priority "+Thread.currentThread().getPriority());
         System.out.println("child thread priority "+t1.getPriority());
    }
}

/*
output
main thread priority 5
child thread priority 3
child thread priority 3
*/