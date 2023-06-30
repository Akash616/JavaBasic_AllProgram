/*GETTING USER INPUT IN JAVA (USING SCANNER CLASS)
1) Scanner class -> java.util package
2) Scanner class method:-
      a) nextInt() -> integer value
      b) next() -> string value //nextLine() -> for whole line
      c) nextDouble() -> point value
      d) next().charAt(0) -> character value  -->chartAt(0) is a string class method
      e) nextLong() -> long value eg:- phone number
3) steps:-
    1. import java.util.Scanner class
    2. create object of Scanner class
    3. use in-built methods to take input.
*/
import java.util.Scanner;
class UserInput
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);    //scanner class object creation
    System.out.println("Enter name");
    String name = s.next();           
    System.out.println("Enter gender");
    char gender = s.next().charAt(0); 
    System.out.println("Enter Age");
    int age = s.nextInt();           
    System.out.println("Enter phone number");
    long ph_no = s.nextLong();     
    System.out.println("----------------------------------------");
    System.out.println("Name :"+name);
    System.out.println("Gender :"+gender);
    System.out.println("Age :"+age);
    System.out.println("Phone number :"+ph_no);
  }
}
    
 
