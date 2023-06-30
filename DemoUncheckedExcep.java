// Unchecked Exception
/*
class DemoUncheckedExcep
{
    public static void main(String[] args) 
    {
	     int a=100, b=0,c;
         c=a/b;
         System.out.println(c);		 
	}	
}
A:\javaprogram>javac DemoUncheckedExcep.java
A:\javaprogram>java DemoUncheckedExcep
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DemoUncheckedExcep.main(DemoUncheckedExcep.java:8)
*/
/*
---------------------------------------------------------------------------------------
class DemoUncheckedExcep
{
    public static void main(String[] args) 
    {
		try
		{
	        int a=100, b=0,c;
            c=a/b;
            System.out.println(c);     //skip
        }
        catch(ArithmeticException e)
        {
			System.out.println("you can not divide by 0");
		}		
		System.out.println("Hello");
	}	
}

output
A:\javaprogram>javac DemoUncheckedExcep.java
A:\javaprogram>java DemoUncheckedExcep
you can not divide by 0
Hello
*/
class DemoUncheckedExcep
{
    public static void main(String[] args) 
    {
		try
		{
	        int a=100, b=2,c;
            c=a/b;
            System.out.println(c);     
        }
        catch(ArithmeticException e)    //skip
        {
			System.out.println("you can not divide by 0");
		}		
		System.out.println("Hello");
	}	
}
output
A:\javaprogram>javac DemoUncheckedExcep.java
A:\javaprogram>java DemoUncheckedExcep
50
Hello










