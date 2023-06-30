//WAP to swap two numbers.
/*class Swap
{
  public static void main(String[] args)
  {
    int a=10,b=20;
    int t;
    t=a;
    a=b;
    b=t;
    System.out.println("value of a:"+a);
    System.out.println("value of b:"+b); 
  }
}
*/
//WAP to swap two numbers without using third variable.
class Swap
{
  public static void main(String[] args)
  {
    int a=10,b=20;
    a= a+b;        //a += b;
    b= a-b;
    a= a-b;
    System.out.println("value of a:"+a);
    System.out.println("value of b:"+b); 
  }
}