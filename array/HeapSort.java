class HeapSort
{
     public static void main(String[] args)
	 {
		 int[] arr=new int[]{22,13,17,11,10,14,12};
		 HeapSort hs=new HeapSort();
		 hs.sort(arr);
		 hs.printArray(arr);
	 }
	 void sort(int[] arr)
	 {
		 int leng=arr.length;   // leng=7
		 
		 for(int i=leng/2-1;i>=0;i--)   // i=2 parent node index position
		 {
			 heapify(arr,leng,i);    //(arr,7,2)
		 }
		 //swap the elements & heapify again
		 for(int i=leng-1;i>=0;i--)
	     {
			 int temp=arr[0];
			 arr[0]=arr[i];
			 arr[i]=temp;
			 
			 heapify(arr,i,0);
		 }
	 }
	 void heapify(int[] arr,int n,int i)
	 {
		 int largest=i;    //parent node index position  -->2
		 int li = 2*i+1;   //left child node index position --> 5
		 int ri = 2*i+2;   //right child node index position --> 6
		 
		 if(li<n && arr[li]>arr[largest])     //(5<7 && arr[5]>arr[2])
		 {
			 largest=li;     //largest=5
		 }
		 if(ri<n && arr[ri]>arr[largest])     //(6<7 && arr[6]>arr[2])
		 {
			 largest=ri;     //largest=6
		 }
		 if(largest!=i)    //largest=5,6 --->6!=2
		 {
			 int temp=arr[i]; // temp=2 index position
			 arr[i]=arr[largest];  //arr[2]=arr[6]
			 arr[largest]=temp;    //arr[6]=2
			 
			 heapify(arr,n,largest);   //recursion
		 }
			
	 }
	 void printArray(int[] arr)
	 {
		 for(int i=0;i<arr.length;i++)
	     {
			 System.out.print(arr[i]+" ");
		 }
	 }
}
/*
A:\javaprogram\array>javac HeapSort.java

A:\javaprogram\array>java HeapSort
10 11 12 13 14 17 22
*/











