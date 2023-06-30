/* STAR PATTERN                    
        *                         i|j
   ROW->* *                       1|1
   (i)  * * *                     2|2
        * * * *                   3|3
          |                       4|4
        COLUMN(j)

class StarPattern1
{
     public static void main(String[] args)
     {
        row-> for(int i=1;i<=4;i++)
              {
        column->  for(int j=1;j<=i;j++)
                  {
                        System.out.print("*");
                  }
                  System.out.println();
              }       
     }
}
-----------------------------------------------------------------------------
2)  * * * *
    * * *
    * *
    *

*/

class StarPattern1
{
   public static void main(String[] args)
   {
         for(int i=1;i<=10;i++)
         {
             for(int j=10;j>=i;j--)
             {
                    System.out.print("*");
             }
             System.out.println();
         }       
   }
}
