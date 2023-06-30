/*
_________________________________________________________________________________
     x x x x x
     x x x x x
     x x x x x
     x x x x x
     x x x x x
____________________________________________________________________________________

 
class StarPattren11
{
  public static void main(String[] args)
  {
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
                System.out.print("*");
           }
           System.out.println();
       }
  }
}

_________________________________________________________________________________
     x           x
       x       x
         x   x
           x
         x   x
       x       x
     x           x
____________________________________________________________________________________
*/


class StarPattren11
{
  public static void main(String[] args)
  {
       for(int i=0;i<5;i++)
       {
           for(int j=0;j<5;j++)
           {
                if(i==j || i+j==5-1)
                {
                    System.out.print("*");
                }
                else
                {
                   System.out.print(" ");
                }
           }
           System.out.println();
       }
  }
}