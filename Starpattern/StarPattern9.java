/*
__________________________________________________________________________________
  x                               x
    x                             . x
      x             ------>       . . x
        x                         . . . x
          x                       . . . . x
___________________________________________________________________________________

class StarPattern9
{
  public static void main(String[] args)
  {
      for(int i=1;i<=4;i++)       //row
      {
           for(int j=1;j<=i;j++)  //column
           {
                if(i>=2 && j<=i-1)
                {
                      System.out.print(" ");
                }
                else
                {
                     System.out.print("*");
                }
           }
           System.out.println();
      }  
  }
}


OR

class StarPattren9
{
  public static void main(String[] args)
  {
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5;j++)
           {
                if(i==j)
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
____________________________________________________________________________________

           x
         x .
       x . .
     x . . .
   x . . . .
_____________________________________________________________________________________
*/

class StarPattern9
{
  public static void main(String[] args)
  {
      for(int i=1;i<=5;i++)       //row
      {
           for(int j=5;j>=i;j--)  //column
           { 
              System.out.print(" ");   
           } 
           for(int k=1;k<=i;k++)
           {
               if(i>=2 && k>1)
               {
                 System.out.print(" "); 
               } 
               else
               System.out.print("*"); 
           }
          System.out.println(); 
      }  
  }
}



