class Resource
{ 

     synchronized public void m(String name)
     { 
          for(int i=1;i<=5;i++)
          {
             System.out.println("Good morning");
             System.out.println("dear "+name);
          }
     }
}
class A extends Thread
{
    Resource r;
    String name;
    A(Resource r,String name)
    {
          this.r=r;
          this.name=name;
    }
    public void run()
    {
          r.m(name); //job for thread
    }
}
class TestSyn
{
    public static void main(String[] args)
    {
       Resource r=new Resource();
       A t1=new A(r,"Akash");
       A t2=new A(r,"shiva");
       t1.start();
       t2.start();   
    }
}


/*
output
Good morning
dear Akash
Good morning
dear Akash
Good morning
dear Akash
Good morning
dear Akash
Good morning
dear Akash
Good morning
dear Akash
Good morning
dear shiva
Good morning
dear shiva
Good morning
dear shiva
Good morning
dear shiva
Good morning
dear shiva
Good morning
dear shiva
*/