//Wap to print multiplication table of any number.
/*
class PrintTable
{
  public static void main(String[] args)
  {
    int no=2;
    for(int i=1;i<=10;i++)
    {
      System.out.println(no+"x"+i+"="+no*i);   //2x1=2
    }
  }
}
*/
//--------USERINPUT---------------------
import java.util.Scanner;
class PrintTable
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number you want to print table:- ");
    int no= s.nextInt();
    for(int i=1;i<=10;i++)
    {
      System.out.println(no+"x"+i+"="+no*i);   //2x1=2
    }
  }
}