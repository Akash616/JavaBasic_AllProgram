/* number of argument
   sequence of argument
   type of argument
*/

 class Test
{  
     
      void show() 
      {
           System.out.println("super class");
           
      }
}
class Xyz extends Test
{
      

   strictfp  void show()  
      {
           
           System.out.println("sub class");
           
      }
      public static void main(String[] args)
      {
          Xyz a=new Xyz();
           a.show();
        
      
      }
}