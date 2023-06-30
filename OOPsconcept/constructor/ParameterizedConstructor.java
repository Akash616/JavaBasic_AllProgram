/* parameterized constructor.

class ParameterizedConstructor
{
   int age;              //instance var.
   String name;
   ParameterizedConstructor(int age,String name)
   {
        this.age=age;
        this.name=name;
   }
   void temp()
   {
      System.out.println(age+"  "+name); 
   }
   public static void main(String[] args)
   {
       ParameterizedConstructor e1=new ParameterizedConstructor(10,"akash");
       ParameterizedConstructor e2=new ParameterizedConstructor(20,"vijay");
       e1.temp();
       e2.temp();
   }
}



OUTPUT

10  akash
20  vijay
 __________________________________________________________________________________________
*/

class ParameterizedConstructor
{
   int age;              //instance var.
   String name;
   ParameterizedConstructor(int age,String name)
   {
        this.age=age;
        this.name=name;
   }
  
      
   public static void main(String[] args)
   {
       ParameterizedConstructor e1=new ParameterizedConstructor(10,"akash");
       ParameterizedConstructor e2=new ParameterizedConstructor(20,"vijay");

       System.out.println(e1.age+"  "+e1.name); 
       System.out.println(e2.age+"  "+e2.name);
   }
}



OUTPUT

10  akash
20  vijay

