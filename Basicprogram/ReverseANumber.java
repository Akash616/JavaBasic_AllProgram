//wap to reverse a number. eg:-5432 ->2345
class ReverseANumber
{
  public static void main(String[] args)
  {
     int no=5432;
     int rem,rev=0;
     while(no != 0)  //jab tak number ki value 0 nahi hoti tab tak while loop chalaga.
     {
         rem=no%10;
         rev=rev*10+rem;
         no=no/10;
     }
     System.out.println(rev);
  }
}
    
 