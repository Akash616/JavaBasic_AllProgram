class LinearSrchString
{
    public static void main(String[] args)
	{
		String[] a=new String[]{"deepesh","vironika","deepak","rahul","amit"};
		String item="rahul";
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(item))     //.equals() method is used for content comparision(in string class).
			{
				System.out.println("item is present at "+i+" index position");
				temp=temp+1;
			}
			
		}
		if(temp == 0)
			{
				System.out.println("item not present in the list");
			}
	}
}
/*
output
A:\javaprogram\array>java LinearSrchString
item is present at 3 index position
*/