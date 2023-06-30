//wap to insert an element(specific position) into an array.
/*--->position
class InsertEleInArray
{
    public static void main(String[] args)
    {
        int[] a=new int[]{10,20,30,40,50};
        int pos=3;   //index_position is 2
        int element=100;
        for(int i=a.length-1;i>pos-1;i--)   //shifting element
        {
             a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
 output
A:\javaprogram\array>java InsertEleInArray
10 20 100 30 40
*/

//-----> Index Position
class InsertEleInArray
{
   public static void main(String[] args)
   {
       int[] a={10,20,30,40,50,60,70,80,90};
       int index_pos=5;
       int element=100;

       int temp=a[a.length-1];    //it store last index value into temp variable.

       for(int i=a.length-1;i>index_pos;i--) 
       {
           a[i]=a[i-1];
       }
       a[index_pos]=element;
       for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        System.out.print(temp);
   }
}
/*  output
A:\javaprogram\array>java InsertEleInArray
10 20 30 40 50 100 60 70 80
90
*/