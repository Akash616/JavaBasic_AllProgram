/*
import java.util.Scanner;
class UserInputOf1D
{
        public static void main(String[] args)
        {
                 int[] a=new int[5];
                 Scanner s=new Scanner(System.in);
                 System.out.println("enter elements");
                 for(int i=0;i<a.length;i++)
                 {
                            a[i]=s.nextInt();
                 }
                 
                 System.out.println("elements of array");

                    for(int i=0;i<a.length;i++)
                    {
                         System.out.print(a[i]+" ");   
                    }
                    System.out.println();
        }
}


 output
enter elements
10 20 30 40 50
elements of array
10 20 30 40 50


or
*/

import java.util.Scanner;
class UserInputOf1D
{
        public static void main(String[] args)
        {
                 int[] a=new int[5];
                 Scanner s=new Scanner(System.in);
                 System.out.println("enter elements");
                 for(int i=0;i<a.length;i++)
                 {
                            a[i]=s.nextInt();
                 }
                 
                 System.out.println("elements of array");

                    for(int x:a)
                    {
                         System.out.print(x+" ");   
                    }
                    System.out.println();
        }
}