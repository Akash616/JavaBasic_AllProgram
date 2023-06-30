//VARIABLE
class Var
{
  
   int a=10;   //instance variable
   static int b=20;  //static variable
   void add()
   {
      int c=30,d;     //c is a local variable
      d=a+b+c;
      System.out.println(d);
   }
   static void mul()
   {
      int e=40,f;
      f=a+b+e;                  /*V.java:16: error: non-static variable a cannot be referenced from a static context
                                    f=a+b+e;
                                      ^
                                    1 error*/
      System.out.println(f);
   }
   public static void main(String args[])
   {
      Var ob=new Var();
      ob.add();
      ob.mul();
   }
}