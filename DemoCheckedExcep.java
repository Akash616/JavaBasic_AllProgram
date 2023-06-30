/* Exception Handling

Syntax:-         try
                 {
			  //risky code
		  }
		  catch(ExceptionClassName  ref.var.name)
		  {
			  //handling code
		  }
		  
/* Checked Exception  -- compiler check 
class DemoCheckedExcep
{
    public static void main(String[] args) 
    {
	     Class.forName("com.mysql.jdbc.Driver");   
	}	
}
A:\>cd javaprogram

A:\javaprogram>javac DemoCheckedExcep.java
DemoCheckedExcep.java:19: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
             FileInputStream fis=new FileInputStream("a:/abc.txt");  
			 
/* checked Exception
import java.io.FileInputStream;
class DemoCheckedExcep
{
    public static void main(String[] args) 
    {
	     FileInputStream fis=new FileInputStream("a:/abc.txt");
	}	
}

A:\>cd javaprogram

A:\javaprogram>javac DemoCheckedExcep.java
DemoCheckedExcep.java:19: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
             FileInputStream fis=new FileInputStream("a:/abc.txt");
---------------------------------------------------------------------------------------------------------------------------
*/
import java.io.FileInputStream;
class DemoCheckedExcep
{
    public static void main(String[] args) 
    {
		try
		{
	       FileInputStream fis=new FileInputStream("a:/abc.txt");
		}
		catch(Exception e)
		{  
		   System.out.println(e);     //s.o.p("file not found");   
		}
	}	
}
/*output
A:\javaprogram>javac DemoCheckedExcep.java
A:\javaprogram>java DemoCheckedExcep
java.io.FileNotFoundException: a:\abc.txt (The system cannot find the file specified)
*/


