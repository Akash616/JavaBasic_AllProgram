/*
   2) can we overload java main() method?
ans:- yes, we can have any number of main methods in a class by method overloading.
      This is because JVM always calls main() method which receives string array as 
      arguments only.

class Test2
{
   
    public static void main(String[] args)
    {
         System.out.println("1");
         Test2 t=new Test2();
         t.main();
    }
    public static void main()
    {
        System.out.println("2");
    }

}

output
1
2
*/

class Test2
{
   
    public static void main(String[] args)
    {
         System.out.println("1");
         Test2 t=new Test2();
         t.main(10);
    }
    public static void main(int a)
    {
        System.out.println("2");
    }

}

output
1
2