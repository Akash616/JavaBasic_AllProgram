// Hierarchical Inheritance.

class A2
{
     void showA()
     {
          System.out.println("a class method");
     } 
}
class B2 extends A2
{
     void showB()
     {
          System.out.println("b class method");
     } 
}
class C2 extends A2
{
     void showC()
     {
          System.out.println("C class method");
     }
     public static void main(String[] a)
     {
           A2 ob1=new A2();
           ob1.showA();
           //ob1.showB();
           //ob1.showC();
           System.out.println("--------------------------------");
           B2 ob2=new B2();
           ob2.showA();
           ob2.showB();
           //ob2.showC();
           System.out.println("--------------------------------");
           C2 ob3=new C2();
           ob3.showA();
           //ob3.showB();
           ob3.showC();
     } 
}



OUTPUT

a class method
--------------------------------
a class method
b class method
--------------------------------
a class method
C class method
