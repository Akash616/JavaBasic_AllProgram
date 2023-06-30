// when we dont override run method.

class Test2 extends Thread
{
      
}
class TestThread2
{
      public static void main(String[] args)
      {
            Test2 t=new Test2();
            t.start();     

            for(int i=0;i<=10;i++)
            System.out.println("main thread "+i);
      }
}

/*
 output
main thread 0
main thread 1
main thread 2
main thread 3
main thread 4
main thread 5
main thread 6
main thread 7
main thread 8
main thread 9
main thread 10
*/