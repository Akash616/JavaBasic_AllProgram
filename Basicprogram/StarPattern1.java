/* STAR PATTERN                    
        *                         i|j
   ROW->* *                       1|1
   (i)  * * *                     2|2
        * * * *                   3|3
          |                       4|4
        COLUMN(j)
*/
class StarPattern1
{
   public static void main(String[] args)
   {
         for(int i=1;i<=4;i++)
         {
             for(int j=1;j<=4;j++)
             {
                    System.out.println("*");
             }
             System.out.println();
         }       
   }
}
