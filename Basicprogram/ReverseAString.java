/*wap to reverse a string.
  eg:- string name="akash"; 
       ->hsaka
       .string method => length()=total number of character in string.
                         "akash"=5
                         charAt()=which index position which character is exist
                         "akash"=>charAt(1)=k,charAt(2)=a
*/
 
class ReverseAString
{
  public static void main(String[] args)
  {
    String name="akash";
    int leng=name.length();  //leng is a variable
    String rev="";
    for(int i=leng-1;i>=0;i--)
    {
         rev=rev+name.charAt(i);   
    } 
    System.out.printf("%s",rev);    //println(rev);
  }
}