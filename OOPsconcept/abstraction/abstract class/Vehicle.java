abstract class Vehicle
{
     abstract void start();
}
class Car extends Vehicle
{
   void start()
    {
         System.out.println("car starts with key");
    }
}
class Scooter extends Vehicle
{
    void start()
    {
        System.out.println("Scooter starts with kick");
    }
    public static void main(String[] args)
    {
        //Vehicle v=new Vehicle();-->does not create object
          Car c=new Car();
          c.start();
          Scooter s=new Scooter();
          s.start();
    }
}

/*
OUTPUT
car starts with key
Scooter starts with kick
*/