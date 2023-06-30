class SelectionSort
{
   public static void main(String[] args)
   {
	   int[] a=new int[]{38,52,9,18,6,62,13};
	   int min,temp=0;
	   for(int i=0;i<a.length;i++)
	   {
		   min=i;
		   for(int j=i+1;j<a.length;j++)  //searching minimum value
		   {
			  if(a[j]<a[min])
              {
				  min=j;
			  }				  
		   }
		   temp=a[i];
		   a[i]=a[min];
		   a[min]=temp;
	   }
	   for(int i=0;i<a.length;i++)
	   {
	   System.out.print(a[i]+" ");
	   }
   }
}
//output:--6 9 13 18 38 52 62
/*
class SelectionSort
{
   public static void main(String[] args)
   {
	   String[] a=new String[]{"deepak","amit","rahul","laxman","ram"};
	   int min;
	   String temp="";
	   for(int i=0;i<a.length;i++)
	   {
		   min=i;
		   for(int j=i+1;j<a.length;j++)  //searching minimum value
		   {
			  if(a[j].compareTo(a[min])<0)
              {
				  min=j;
			  }				  
		   }
		   temp=a[i];
		   a[i]=a[min];
		   a[min]=temp;
	   }
	   for(int i=0;i<a.length;i++)
	   {
	   System.out.print(a[i]+" ");
	   }
   }
}*/
//output:--amit deepak laxman rahul ram

