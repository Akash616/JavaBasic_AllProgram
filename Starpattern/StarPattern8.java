/*
______________________________________________________________________________________
x x x x x x x x x
  x x x x x x x
    x x x x x
      x x x
        x
_______________________________________________________________________________________

class StarPattern8
{
  public static void main(String[] args)
  {
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i;j++)
         {
               System.out.print(" ");
         }
         for(int k=5;k>=i;k--)
         {
               System.out.print("*");
         }
         for(int m=4;m>=i;m--)
         {
               System.out.print("*");
         }
         System.out.println(); 
     }
  }
}
___________________________________________________________________________________________

class StarPattern8
{
  public static void main(String[] args)
  {
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i;j++)
         {
               System.out.print(" ");
         }
         for(int k=9;k>(i*2);k--)
         {
               System.out.print("*");
         }
         
         System.out.println(); 
     }
  }
}
______________________________________________________________________________________________
*/
class StarPattern8
{
  public static void main(String[] args)
  {
      for(int i=5;i>=1;i--)
      {
         for(int j=5;j>i;j--)
         {
               System.out.print(" ");
         }
         for(int k=1;k<(i*2);k++)
         {
               System.out.print("*");
         }
         
         System.out.println(); 
     }
  }
}
