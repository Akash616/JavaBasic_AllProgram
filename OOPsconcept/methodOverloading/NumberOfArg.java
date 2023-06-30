// Method overloading :-type of polymorphism

class NumberOfArg
{
    void show(int a)
    {
          System.out.println("1");
    }
    void show(String a,int b)
    {
          System.out.println("2");
    }
    public static void main(String[] args)
    {
         NumberOfArg t=new NumberOfArg();
         t.show(10);
         t.show("akash",20);
    }
}

output
1
2