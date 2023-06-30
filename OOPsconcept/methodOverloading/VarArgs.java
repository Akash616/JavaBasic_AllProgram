// Varargs:- the varargs allows the method to accept zero or multiple arguments.

class VarArgs
{
    void show(int a)
    {
          System.out.println("1");
    }
    void show(int... a)
    {
          System.out.println("2");
    }
    public static void main(String[] args)
    {
          VarArgs t=new  VarArgs();
          t.show(10);
          t.show(10,20,30);
          t.show();
    }
}


OUTPUT
1
2
2


