interface I
{
       void show();
      
}
class Test implements I
{
       public void show()
       {
            System.out.println("1");
       }
       public static void main(String[] args)
       {
            Test t=new Test();
            t.show();
       }

}
