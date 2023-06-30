//getting priority of thread

class A extends Thread
{
      public void run()
      {
           System.out.println("child thread priority "+Thread.currentThread().getPriority());
      }
}
class TestPriority
{
    public static void main(String[] args)
    {
         A t1=new A();
         t1.start();
         System.out.println("main thread priority "+Thread.currentThread().getPriority());
         
         //t1.getPriority();
         System.out.println("child thread priority "+t1.getPriority());
    }
}
 
/*
output
child thread priority 5
main thread priority 5
child thread priority 5
*/