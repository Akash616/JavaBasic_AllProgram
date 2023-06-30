/*
   Using reference variable.
*/

class Animal1
{
    String color;     //instance variable
    int age;
    public static void main(String[] args)
    {
       Animal1 buzo=new Animal1();
       buzo.color = "black";    //ref. var
       buzo.age = 10;           //ref. var
       
       System.out.println(buzo.color+" "+buzo.age);   
    }    
}



output

black 10
