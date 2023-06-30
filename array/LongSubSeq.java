//wap to find length of longest consecutive sequence in array of integers.
// contains() method return boolean value.
import java.util.HashSet;
class LongSubSeq
{
   public static void main(String[] args)
   {
      int[] a=new int[]{3,9,1,10,4,20,2};
	  HashSet<Integer> hs=new HashSet<Integer>();
	  for(int i=0;i<a.length;i++)     //it remove duplicacy 
	  {
		  hs.add(a[i]);
	  }
	  int long_leng=0;
	  for(int i=0;i<a.length;i++)
	  {
		  if(!hs.contains(a[i]-1))
		  {
			 int no=a[i];
             while(hs.contains(no))
			 {
				 no++;
			 }	
             if(long_leng < no-a[i])
			 {
				 long_leng = no-a[i];
			 }				 
		  }
	  }
	  System.out.print("Longest sub sequence length is "+long_leng);
   }
}
/*
output
A:\javaprogram\array>java LongSubSeq
Longest sub sequence length is 4
*/