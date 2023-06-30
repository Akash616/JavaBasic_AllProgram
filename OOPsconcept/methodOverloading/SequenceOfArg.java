// Method overloading :-type of polymorphism

class SequenceOfArg
{
    void show(int a,String b)
    {
          System.out.println("1");
    }
    void show(String a,int b)
    {
          System.out.println("2");
    }
    public static void main(String[] args)
    {
         SequenceOfArg t=new SequenceOfArg();
         t.show(10,"akash");
         t.show("akash",20);
    }
}

output
1
2
