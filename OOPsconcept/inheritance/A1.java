// single-level inheritance.

class A1
{
     void showA()
     {
          System.out.println("a class method");
     } 
}
class B1 extends A1
{
     void showB()
     {
          System.out.println("b class method");
     } 
     public static void main(String[] args)
     {
         A1 obj1=new A1();
         obj1.showA();
         //obj1.showB();

         B1 obj2=new B1();
         obj2.showA();
         obj2.showB();
     }
}

/*
Output

javac A1.java
java B1
a class method
a class method
b class method
*/