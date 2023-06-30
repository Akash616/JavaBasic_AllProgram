// defining a thread by extending thread class and implementing runnable interface.

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        System.out.println("child of A "+i);
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        System.out.println("child of B "+i);
    }
}
class Demo
{
    public static void main(String[] args)  //main thread
    {
        A t1=new A();       //first thread
        B r=new B();
        Thread t2=new Thread(r);   //second thread
         t1.start();
         t2.start();
         for(int i=1;i<=5;i++)
         System.out.println("main thread "+i);    
    }
}