class Table
{
   Synchronized public void printTable(int n)
   {
        for(int i=1;i<=5;i++){
        System.out.println("Factorial of a number is :");
        try
        {
             Thread.slee(1000);
        }
        catch(InterruptedException e)
        {
             System.out.println(e);
        }
        System.out.println(n*i);
        }
   }
}
class MyThread1 extends Thread
{
    table t;
    MyThread1(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class MyThread2 extends Thread
{
    table t;
    MyThread2(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(100);
    }
}
class TestSynch
{
     public static void main(String[] args)
     {
          Table obj=new Table();
          MyThread1 t1=new MyThread1(obj);
          MyThread2 t2=new MyThread2(obj);
          t1.start();
          t2.start(); 
     }
}