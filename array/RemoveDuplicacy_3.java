//wap to remove duplicate elements from an array and then return the new length of the array.
//It applicable only sorted array

class RemoveDuplicacy_3
{
    public static void main(String[] args)
    {
        int[] a={1,2,2,3,4,5,5,5,5};
        int j=0;

        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] != a[i+1])
            {
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[a.length-1];   //1 2 3 4 4 5 5 5 5
        for(int i=0;i<j+1;i++)
        {
            System.out.print(a[i]+" ");
        } 
    }
}
/*   output
A:\javaprogram\array>java RemoveDuplicacy_3
1 2 3 4 5 
*/
/*
for(int i=0;i<a.length;i++)
{
   System.out.print(a[i]+" ");
}

output
1 2 3 4 5 5 5 5
*/