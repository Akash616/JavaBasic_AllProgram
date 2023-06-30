class StaticKeyExample
{  
    static int x;
    static
    {
         System.out.println("first static block");
         System.out.println("value of x"+x);
         x=10;
          Test.m();  
    } 
   static void m()
    {
         System.out.println("value of x"+x);
    }
     public static void main(String[] args)
       {      
           
            System.out.println("main method invoked");     
            m2();       
        }  
    static void m2()
    {
         System.out.println("m2 invoked");
    }
    static
    {
                 System.out.println("second static block");
    }
    static int y=20;
}