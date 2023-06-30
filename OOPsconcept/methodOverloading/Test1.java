/* 1)Can we achieve method overloading by changing the return type of method only?
  :- In java, method overloading is not possible by changing the return type of the method
     only because of Ambiguity.
*/

class Test1
{
    void show(int a)
    {
          System.out.println("1");
    }
    String show(int b)
    {
          System.out.println("2");
    }
    public static void main(String[] args)
    {
         Test1 t=new Test1();
         t.show(10);
    }
}
 
 Test1.java:12: error: method show(int) is already defined in class Test1
    String show(int b)
           ^
  1 error