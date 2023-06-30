//STATIC IMPORT 

import java.lang.Math;
class StaticImport
{
    public static void main(String[] args)
    {
         System.out.println(Math.sqrt(4)); 
         System.out.println(Math.max(4,6)); 
         System.out.println(Math.min(43,10)); 
         System.out.println(Math.pow(4,2)); 
         System.out.println(Math.round(4.5)); 
    }
}

/*
output
2.0
6
10
16.0
5
___________________________________________________________________________________
If we dont write Math again and again.----->use static import
*/

import static java.lang.Math.*;
class StaticDemo
{
    public static void main(String[] args)
    {
         System.out.println(sqrt(4)); 
         System.out.println(max(4,6)); 
         System.out.println(min(43,10)); 
         System.out.println(pow(4,2)); 
         System.out.println(round(4.5)); 
    }
}
