//wap to find the duplicate elements b/w two arrays.
import java.util.HashSet;
class DuplicateElement
{
     public static void main(String[] args)
	 {
	     int[] arr1={4,3,7,9,2,4};
		 int[] arr2={5,1,4,8,3,5};
		 
         HashSet<Integer> hs1=new HashSet<>();
         HashSet<Integer> hs2=new HashSet<>();
		 
		 for(int no: arr1)     //it remove duplicacy of arr1
		 {
			 hs1.add(no);
		 }
		 for(int no: arr2)     //it remove duplicacy of arr2
		 {
			 hs2.add(no);
		 }
		 for(int no: hs2)
		 {
			 boolean b=hs1.add(no);
			 if(b==false)
			 System.out.println(no);
		 }
	 }
}
/*
output
A:\javaprogram\array>java DuplicateElement
3
4
*/