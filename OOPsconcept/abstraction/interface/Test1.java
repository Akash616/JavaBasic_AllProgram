interface I1
{
       void show();
      
}
interface I2
{
       void disp();
}
class Test1 implements I1,I2
{
       public void show()
       {
            System.out.println("1");
       }
       public void disp()
       {
                 System.out.println("2");
       }
       public static void main(String[] args)
       {
            Test1 t=new Test1();
            t.show();
            t.disp();
       }

}


/*
output

1
2
*/
