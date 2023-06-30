import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
      YoungerAgeException(String msg)
	  {
		  super(msg);
	  }
}
class DemoThrow
{
	public static void main(String[] args)
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter your age");
		 int age=s.nextInt();
		 try
		 {
		 if(age<18)
	     {
			 throw new YoungerAgeException("you are not eligible to voting");  //programmer manually create the exception object.
		 }
		 else
		 {
			 System.out.println("you are eligible");
		 }
		 }
		 catch(YoungerAgeException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("hello");
	}
}
/*
output
A:\javaprogram>javac DemoThrow.java

A:\javaprogram>java DemoThrow
Enter your age
16
YoungerAgeException: you are not eligible to voting
        at DemoThrow.main(DemoThrow.java:20)
hello
_________________________________________________________________________________________________

A:\javaprogram>java DemoThrow
Enter your age
19
you are eligible
hello

*/