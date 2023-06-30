//If we want to set priority of main thread

class A2 extends Thread
{
      public void run()
      {
           System.out.println("child thread priority "+Thread.currentThread().getPriority());
      }
}
class TestPriority2
{
    public static void main(String[] args)
    {
         A2 t1=new A2();
         t1.start();
         t1.setPriority(3);
         Thread.currentThread().setPriority(Thread.MAX_PRIORITY);//main thread

         System.out.println("main thread priority "+Thread.currentThread().getPriority());
         System.out.println("child thread priority "+t1.getPriority());
    }
}

/*
output
main thread priority 10
child thread priority 3
child thread priority 3
*/