/*
  3) Automatic Promotion of datatype in method overloading.
  :- One type is promoted to another implicitly if no matching datatype is found.
     diagram:- copy.
*/
            
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

