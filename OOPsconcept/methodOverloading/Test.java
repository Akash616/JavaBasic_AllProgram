// Method overloading :-type of polymorphism

class Test
{
    void show()
    {
          System.out.println("1");
    }
    void show()
    {
          System.out.println("2");
    }
    public static void main(String[] args)
    {
         Test t=new Test();
         t.show();
    }
}


/*
A:\javaprogram\OOPsconcept\methodOverloading>javac Test.java
Test.java:9: error: method show() is already defined in class Test
    void show()
         ^
1 error
*/