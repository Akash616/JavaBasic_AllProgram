/*
________________________________________________________________________________________________
1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
________________________________________________________________________________________________

class NumericPattern7
{
   public static void main(String[] args)
   {
         int no=0; 
         for(int i=1;i<=5;i++)
         {
            
             for(int j=1;j<=3;j++)
             {
                 no=no+1;
                 System.out.print(no+" ");
             }
             System.out.println();
         }
   }
}
______________________________________________________________________________________________________
      |1 2  3 column
______|________________ 
row1  |1  2  3
   2  |6  5  4
   3  |7  8  9
   4  |12 11 10
   5  |13 14 15
_________________________________________________________________________________________________
*/

class NumericPattern7
{
   public static void main(String[] args)
   {
         int no=0; 
         for(int i=1;i<=5;i++)
         {
            if(i%2 != 0)       //odd
            {
              for(int j=1;j<=3;j++)
              {
                 no=no+1;
                 System.out.print(no+" ");
              }
            }
            else            //even
            { 
              int temp=no+1;
              for(int j=no+3;j>=temp;j--)
              {
                 no=no+1;
                 System.out.print(j+" ");
              }
            }
            System.out.println();
         }
   }
}


