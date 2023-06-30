// Real world example of class,object and method.

class Animal1
{
        public void eat()    //method
        {
               System.out.println("i am eating");
        }
        public static void main(String[] args)     //main method
        {
               System.out.println("1");
               Animal1 buzo=new Animal1();     //object creation
               buzo.eat();                     //object calling method using dot operator(.)
               buzo.run();      
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