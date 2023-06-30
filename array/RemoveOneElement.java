//Wap to remove a specific element from an array.
class RemoveOneElement
{
    public static void main(String[] args)
    {
         int[] a=new int[]{10,40,30,80,60,20};
         int del_elem=30;
         int count=0;

         for(int i=0;i<a.length;i++)
         {
             if(a[i]==del_elem)
             {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                count=count+1;
                break;
             }
         }
         if(count==0)
         {
             System.out.println("Element not found");
         }
         else
         {
             System.out.println("Element deleted successfully");
             for(int i=0;i<a.length-1;i++)
             {
                  System.out.print(a[i]+" ");
             }
         }
         
    }
}
/*
output
A:\javaprogram\array>java RemoveOneElement
Element deleted successfully
10 40 80 60 20
*/