/*Wap to remove duplicate elements from an array and then return the new length of the array.
FOR EXAMPLE:- [20,20,30,40,50,50,50]     [30,20,10,50,20,30]
After removing the duplicate elements the program should return 4 as the new length of the array.
----> 1st way is by using HashSet[Sorted and Unsorted array(both applicable)]
*/
//HashSet property is they are not store duplicate element.

import java.util.HashSet;
class RemoveDuplicacy_1
{
   public static void main(String[] args)
   {
        int[] a=new int[]{1,3,2,4,2,3,4,5,5};  //unsorted array
        HashSet<Integer> hs=new HashSet<Integer>();
    
        for(int i=0;i<a.length;i++)
        {
             hs.add(a[i]);
        }
        for(int no:hs)
        {
             System.out.print(no+" ");
        }
   }
}

/* 
output
A:\javaprogram\array>java RemoveDuplicacy_1
1 2 3 4 5
*/