
import java.util.Scanner;
class UserInputOf3D
{
        public static void main(String[] args)
        {
                 int[][][] a=new int[2][2][2];
                 Scanner s=new Scanner(System.in);
                 System.out.println("enter elements");
                 for(int i=0;i<a.length;i++)
                 {
                    for(int j=0;j<a[i].length;j++)
                     {
                          for(int k=0;k<a[j].length;k++)
                          {
                                a[i][j][k]=s.nextInt();
                          }
                     }
                 }
                 
                 System.out.println("elements of array");

                    for(int i=0;i<a.length;i++)
                    {
                        for(int j=0;j<a[i].length;j++)
                        { 
                             for(int k=0;k<a[i][j].length;k++)
                             {
                                 System.out.print(a[i][j][k]+" ");  
                             }
                         }  
                    }
                    System.out.println();
        }
}

/*
output
enter elements
1
2
3
4
5
6
7
8
elements of array
1 2 3 4 5 6 7 8
*/







