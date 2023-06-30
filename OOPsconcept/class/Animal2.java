/* 
   We can create multiple object in one program,
   but it is not maindatory 
*/

class Animal2
{
        public void eat()    //method
        {
               System.out.println("i am eating");
        }
        public static void main(String[] args)     //main method
        {
               System.out.println("1");
               Animal2 buzo=new Animal2();     //object creation
               buzo.eat();                     //object calling method using dot operator(.)
               buzo.run();

               Animal2 aa=new Animal2();
               aa.run();
               aa.eat();      
        }
        public void run()    //method
        {
               System.out.println("i am running");
        }
}

output

1
i am eating
i am running
i am running
i am eating