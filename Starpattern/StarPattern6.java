/*
___________________________________________________________________________
       _ _ _ _*
       _ _ _ * *
       _ _  * * *
       _   * * * *
__________________________________________________________________________

class StarPattern6
{
   public static void main(String[] args)
   {
       for(int i=1;i<=10;i++)
       {
           for(int j=10;j>=i;j--)
           {
              System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
              System.out.print(" *");
           }
           System.out.println();
       }
   }
}
--------------------------------------------------------------------------
*/

class StarPattern6
{
   public static void main(String[] args)
   {
         for(int i=1;i<=5;i++)
         {
            for(int j=5;j>=1;j--)
            {
                if(j>i)
                System.out.print(" ");
                else
                System.out.print(" *");
            }
            System.out.println();
         }
   }
}
