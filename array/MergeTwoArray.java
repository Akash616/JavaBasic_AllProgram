//Wap to merge the elements of two arrays in one arrays.
class MergeTwoArray
{
   public static void main(String[] args)
   {
        int[] a=new int[]{10,20,30};
        int[] b=new int[]{40,50,60,70,80};
        
        int a_leng=a.length;
        int b_leng=b.length;
        int c_leng=a_leng+b_leng;

        int[] c=new int[c_leng];
        for(int i=0;i<a.length;i++)    //putting a array elem. into c array
        {
              c[i]=a[i];
        }
        for(int i=0;i<b_leng;i++)      //putting b array elem. into c array
        {
              c[a.length+i]=b[i];
        }
        for(int i=0;i<c_leng;i++)
        {
           System.out.print(c[i]+" ");
        }
   }
}
/*
 output
A:\javaprogram\array>java MergeTwoArray
10 20 30 40 50 60 70 80
*/