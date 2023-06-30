/*wap to print all prime number between 1 to 100.
class PrimeNumberAll
{
  public static void main(String[] args)
  {
     int temp=0;   //
     for(int no=1;no<=100;no++)
     {
        for(int i=2;i<=no-1;i++)
        {
            if(no%i == 0)
            {
                   temp=temp+1;
            } 
        } 
        if(temp==0)
        {
           System.out.println(no);
        }
        else
        {
            temp=0;
        }
     }
  }
}
--------------------------------------------------------------------------
*/
class PrimeNumberAll
{
  public static void main(String[] args)
  {
     
     for(int no=1;no<=100;no++)
     {
        int temp=0;  //
        for(int i=2;i<=no-1;i++)
        {
            if(no%i == 0)
            {
                   temp=temp+1;
            } 
        } 
        if(temp==0)
        {
           System.out.println(no);
        }
       
     }
  }
}