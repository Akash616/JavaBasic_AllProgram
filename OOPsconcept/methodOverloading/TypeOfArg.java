// Method overloading :-type of polymorphism

class TypeOfArg
{
    void show(int a)
    {
          System.out.println("1");
    }
    void show(String a)
    {
          System.out.println("2");
    }
    public static void main(String[] args)
    {
         TypeOfArg t=new TypeOfArg();
         t.show(10);
         t.show("akash");
    }
}


output
1
2