//VARIABLE
class Variable
{
  
   int a=10;   //instance variable
   static int b=20;  //static variable
   void add()
   {
      int c=30,d;     //c is a local variable
      d=a+b+c;
      System.out.println(d);
   }
   void mul()
   {
      int e=40,f;
      f=a+b+e;
      System.out.println(f);
   }
   public static void main(String args[])
   {
      Variable ob=new Variable();
      ob.add();
      ob.mul();
   }
}