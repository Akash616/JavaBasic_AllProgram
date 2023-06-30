import java.io.*;
class ReadAndWrite
{
	void readFile() throws Exception
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		
	}
	void saveFile() throws Exception
	{
		String text="this is demo";
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
	}
}
class DemoThrows
{
	public static void main(String[] args)
	{
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
		rw.readFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Akash");
		try
		{
		rw.saveFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
	    }
		System.out.println("hello");
	}
}
/*
output

A:\javaprogram>javac DemoThrows.java

A:\javaprogram>java DemoThrows
java.io.FileNotFoundException: d:\abc.txt (The system cannot find the path specified)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(FileInputStream.java:195)
        at java.io.FileInputStream.<init>(FileInputStream.java:138)
        at java.io.FileInputStream.<init>(FileInputStream.java:93)
        at ReadAndWrite.readFile(DemoThrows.java:6)
        at DemoThrows.main(DemoThrows.java:22)
Akash
java.io.FileNotFoundException: d:\xyz.txt (The system cannot find the path specified)
        at java.io.FileOutputStream.open0(Native Method)
        at java.io.FileOutputStream.open(FileOutputStream.java:270)
        at java.io.FileOutputStream.<init>(FileOutputStream.java:213)
        at java.io.FileOutputStream.<init>(FileOutputStream.java:101)
        at ReadAndWrite.saveFile(DemoThrows.java:12)
        at DemoThrows.main(DemoThrows.java:31)
hello

*/