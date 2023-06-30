//STATIC AND INSTANCE VARIABLE EXAMPLE
class Variables
{
   int a=10;          //intance variable
   static int b=20;   //static variable
   public static void main(String args[])
   {
     Variables obj1=new Variables();
     System.out.println(obj1.a);    //10
     System.out.println(obj1.b);    //20
     obj1.a=1000;
     obj1.b=2000;
     System.out.println(obj1.a);    //1000
     System.out.println(obj1.b);    //2000
     Variables obj2=new Variables();
     System.out.println(obj2.a);    //10
     System.out.println(obj2.b);    //2000
   }
}