class Test
{
    public void m1()
   {
        for(int i=1;i<=4;i++)
        {
           for(int j=1;j<=i;j++)
                  {
                        System.out.print(" * ");
                  }
                  System.out.println();
         } 
      
   }
    public void m2()
   {
        for(int i=1;i<=4;i++)
        {
                for(int j=1;j<=i;j++)
                  {
                        System.out.print(" # ");
                  }
                  System.out.println();
        }       
   }
}
class MyThread1 extends Thread 
{
     Test t;
     MyThread1(Test t)
     {
        this.t=t;  
     }
     public void run()
     {
         t.m1(); 
       
     }    
}

class MyThread2 extends Thread
{ 
     Test t;
     MyThread2(Test t)
     {
         this.t=t;
     }
     public void run()
     {
        t.m2(); 
     }
}

 class TestSyn
{
   public static void main(String[] args)
   {
       Test obj=new Test();

       MyThread1 t1=new MyThread1(obj);
       MyThread2 t2=new MyThread2(obj);

       t1.start();
       t2.start();
   }
}