/*
__________________________________________________________________________________________
                 x
               x x x
             x x x x x
           x x x x x x x
         x x x x x x x x x
__________________________________________________________________________________________

class StarPattern7
{
   public static void main(String[] args)
   {
          for(int i=1;i<=5;i++)          //this is for ROW
          {
              for(int j=5;j>=i;j--)      //this is for column
              {
                  System.out.print(" ");
              }
              for(int k=1;k<=i;k++)      //this is for column
              {
                  System.out.print("x");
              }
              for(int m=2;m<=i;m++)     //this is for column
              {
                  System.out.print("x");
              }
              System.out.println();
          }
   }
} 
___________________________________________________________________________________________
*/
class StarPattern7
{
  public static void main(String[] args)
  {
      for(int i=1;i<=5;i++)
      {
        for(int j=5;j>=i;j--)
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
