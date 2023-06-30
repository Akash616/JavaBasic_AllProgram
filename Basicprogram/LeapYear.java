/* WAP to check for leap year.
   condition for leap year:-
   1) proper divide by 400.
   2) proper divide by 4 but not divisible by 100.

class LeapYear
{
  public static void main(String[] args)
  {
    int year = 2016;
    if(year%4 == 0)
    { 
      if(year%100 == 0)
      {
        if(year%400 == 0) 
        {
          System.out.println("leap year"); 
        }
        else
        {
          System.out.println("not a leap year"); 
        }
      }
      else
      {
        System.out.println("leap year"); 
      }
    }
    else
    {
      System.out.println("not a leap year");  
    }
  }
}

OR
*/
class LeapYear
{
  public static void main(String[] args)
  {
    int year = 2016;
    if((year%400 == 0) || (year%4 == 0 && year%100 !=0))
    {
       System.out.println("leap year");
    }
    else
    {
       System.out.println("not a leap year");
    }
  }
}
          
