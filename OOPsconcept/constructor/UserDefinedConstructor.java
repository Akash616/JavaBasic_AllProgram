//  no-argument constructor(user defined constructor).

class UserDefinedConstructor
{
   int age=10;   //INSTANCE VAR.
   String name="akash";
   UserDefinedConstructor()
   {
      System.out.println(age+" user defined constructor "+name);   
   }
   public static void main(String[] args)
   {
         
       UserDefinedConstructor obj=new UserDefinedConstructor();
      
   }
}


OUTPUT

10 user defined constructor akash