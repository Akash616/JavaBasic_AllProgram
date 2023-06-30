//wap to remove duplicate elements from an array and then return the new length of the array.
//It applicable only sorted array

class RemoveDuplicacy_2
{
    public static void main(String[] args)
    {
        int[] a={1,2,2,3,4,5,5};
        int[] temp=new int[a.length];

        int j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] != a[i+1])
            {
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];   //1 2 3 4 0 0 0
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
/*
output
1 2 3 4 5 0 0
*/