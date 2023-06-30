// program to create calculator using switch case.
/*
class Calculator
{
  public static void main(String[] args)
  {
    int no1=10, no2=20, res;
    String sym = "-";    //here string and char allowed only 
    switch(sym)
    {
       case "+" : res= no1 + no2;
                System.out.println(res);
                break;
       case "-" : res= no1 - no2;
                System.out.println(res);
                break;
       case "*" : res= no1 * no2;
                System.out.println(res);
                break;
       case "/" : res= no1 / no2;
                System.out.println(res);
                break;
       case "%" : res= no1 % no2;
                System.out.println(res);
                break;
       default: System.out.println(" Invalid symbol");
                break;
    }
  }
} 
*/

//--------------------------USER INPUT-----------------------------------
import java.util.Scanner;
class Calculator
{
  public static void main(String[] args)
  {
    String yn;
    do
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first number:");
      int no1= s.nextInt();
      System.out.println("Enter second number:");
      int no2= s.nextInt();
      System.out.println("Enter Symbol (+,-,/,*,%)");
      String sym= s.next();
      int res;

      switch(sym)
      {
           case "+" : res= no1 + no2;
                      System.out.println("Addition is :"+res);
                      break;
           case "-" : res= no1 - no2;
                      System.out.println("Subtraction is:"+res);
                      break;
           case "*" : res= no1 * no2;
                      System.out.println("Multiplication is:"+res);
                      break;
           case "/" : res= no1 / no2;
                      System.out.println("Division is:"+res);
                      break;
           case "%" : res= no1 % no2;
                      System.out.println("Modulus is:"+res);
                      break;
           default  : System.out.println(" Invalid symbol");
                      break;
       }
       System.out.println("Do you want to continue(Press y for Yes and n for No)");
       yn= s.next(); 
    }while(yn.equals("y") || yn.equals("Y"));
  }
}