/*
  we can create multiple classes in one program,
  but only one main method in our program.
*/

class Animal3
{
        public void eat()    //method
        {
               System.out.println("i am eating");
        }
        public static void main(String[] args)     //main method
        {
               System.out.println("1");
               Animal3 buzo=new Animal3();     //object creation  for Animal3 class
               buzo.eat();                     //object calling method using dot operator(.)
               buzo.run();

               Birds sp=new Birds();         //object creation  for Birds class
               sp.fly();
        }
        public void run()    //method
        {
               System.out.println("i am running");
        }
}
class Birds                       
{
     void fly()
     {
            System.out.println("i am flying");
     }

}

OUTPUT
1
i am eating
i am running
i am flying