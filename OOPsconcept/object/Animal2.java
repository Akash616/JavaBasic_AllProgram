/*
   Using method.
*/


class Animal2
{
    String color;     //instance variable
    int age;
    void intObj(int a,String c)
    {
         color=c;
         age=a;    
    }
    void disp()
    {
          System.out.println(color+ " " +age);  
    }
    public static void main(String[] args)
    {
         Animal2 buzo=new Animal2();
         buzo.intObj(20,"black");
         buzo.disp();
    }    
}

OUTPUT

black 20