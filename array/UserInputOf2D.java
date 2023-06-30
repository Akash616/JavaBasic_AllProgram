import java.util.Scanner;
class UserInputOf2D
{
        public static void main(String[] args)
        {
                 int[][] a=new int[3][3];
                 Scanner s=new Scanner(System.in);
                 System.out.println("enter elements");
                 for(int i=0;i<a.length;i++)
                 {
                    for(int j=0;j<a[i].length;j++)
                     {
                            a[i][j]=s.nextInt();
                     }
                 }
                 
                 System.out.println("elements of array");

                    for(int i=0;i<a.length;i++)
                    {
                        for(int j=0;j<a[i].length;j++)
                        {
                           System.out.print(a[i][j]+" "); 
                         }  
                    }
                    System.out.println();
        }
}
/*
enter elements
1
2
3
4
5
6
7
8
9
elements of array
1 2 3 4 5 6 7 8 9
*/
