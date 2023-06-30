//STATIC VARIABLE important 
class StaticVariableExample
{
   static int a=10;
   public static void main(String args[])
   {
      StaticVariableExample s1=new  StaticVariableExample();
      StaticVariableExample s2=new  StaticVariableExample();
      System.out.println("s1.a value :"+s1.a);
      System.out.println("s2.a value :"+s2.a);
      //change s1 a value alone
      s1.a=20;
      System.out.println("s1.a value :"+s1.a);
      System.out.println("s2.a value :"+s2.a);
      s2.a=40;
      System.out.println("s1.a value :"+s1.a);
      System.out.println("s2.a value :"+s2.a);
   }
}


/*   output
A:\javaprogram\Variable>java StaticVariableExample
s1.a value :10
s2.a value :10
s1.a value :20
s2.a value :20
s1.a value :40
s2.a value :40
*/
// static variable value change hona par, static variable ki value same rahti hai har ak object ka leya.