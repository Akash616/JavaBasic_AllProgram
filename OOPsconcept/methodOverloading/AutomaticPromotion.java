/*
  3) Automatic Promotion of datatype in method overloading.
  :- One type is promoted to another implicitly if no matching datatype is found.
     diagram:- copy.

CASE:-1          
class AutomaticPromotion
{
    void show(int a)
    {
          System.out.println("int method");
    }
    void show(String a)
    {
          System.out.println("string method");
    }
    public static void main(String[] args)
    {
         AutomaticPromotion t=new AutomaticPromotion();
         t.show('a');  //a is character
    }
}

output
int method
*/
/*
------------------------------------------------------------------------------------------
Object is the parent class of all the classes in java.
CASE:-2  
class AutomaticPromotion
{
    void show(Object a)
    {
          System.out.println("int method");
    }
    void show()
    {
          System.out.println("string method");
    }
    public static void main(String[] args)
    {
         AutomaticPromotion t=new AutomaticPromotion();
         t.show("abc");  //a is character
    }
}

OUTPUT
int method

OR

while resolving overloaded methods, compiler will always give precedence for the child type
argument than compared with parent type argument.

class AutomaticPromotion
{
    void show(Object a)  //parent type argument
    {
          System.out.println("int method");
    }
    void show(String a)  //child type argument
    {
          System.out.println("string method");
    }
    public static void main(String[] args)
    {
         AutomaticPromotion t=new AutomaticPromotion();
         t.show("abc");  //a is character
    }
}

OUTPUT
string method
________________________________________________________________________________________________
*/

class AutomaticPromotion
{
    void show(char a,float b)
    {
          System.out.println("1");
    }
    void show(String a,double b)
    {
          System.out.println("2");
    }
    void show(float a,float b)
    {
          System.out.println("3");
    }
    public static void main(String[] args)
    {
         AutomaticPromotion t=new AutomaticPromotion();
         t.show(10,10.1f);      //->3
         t.show("akash",20.1f); //->2
         t.show(20.2f,30.1f);   //->3

         t.show('a',10);        //->1
         t.show("ak",'b');      //->2
          
    }
}