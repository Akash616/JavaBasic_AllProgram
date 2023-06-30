
class BubbleSort
{
   public static void main(String[] args)
   {
	   int[] a=new int[]{36,19,29,12,5};
	   int temp;
	   for(int i=0;i<a.length;i++)   //no. of rounds
	   {
		   int flag=0;
		   for(int j=0;j<a.length-1-i;j++)   //comparing adjacent values
		   {
			    if(a[j]>a[j+1])
				{
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 flag=1;
				}
		   }
		   if(flag == 0)
		   {
			   break;
		   }
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
   }
}
//output:--5 12 19 29 36

/*
class BubbleSort
{
   public static void main(String[] args)
   {
	   String[] a=new String[]{"deepak","amit","rahul","laxman","ram"};
	   String temp;
	   for(int i=0;i<a.length;i++)   //no. of rounds
	   {
		   int flag=0;
		   for(int j=0;j<a.length-1-i;j++)   //comparing two adjacent values
		   {
			    if(a[j].compareTo(a[j+1])>0)
				{
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 flag=1;
				}
		   }
		   if(flag == 0)
		   {
			   break;
		   }
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
   }
}
*/
//output:--amit deepak laxman rahul ram

