class A extends Thread
{
   public void run()
   {
       int n=2;
       for(int i=1;i<=10;i++)
       {
          System.out.println(n+"x"+i+"="+n*i);
       }
   }
}
class B extends Thread
{
   public void run()
   {
       int n=5;
       int fact=1;
       while(n>0)
       {
            fact=fact*1;
            n--;
       }
       System.out.println("Factorial of "+n+" is:"+fact);
   }
}
class C extends Thread
{
   public void run()
   {
        try
        {
          int n=12;
          if(n%2 == 0)
          System.out.println("even number");
          else
          System.out.println("odd number");
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
   }
}
class ThreadPriority
{
   public static void main(String[] args)
   {
     A t1=new A();
     B t2=new B();
     C t3=new C();
    
     t1.setPriority(10);
     t2.setPriority(5);
     t3.setPriority(1);

     t1.start();
     t2.start();
     t3.start();
     t1.start();
   }
     
}