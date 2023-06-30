//Example of interface and abstract class

abstract class Product
{
     String name;
     int id;
     void getData(String name,int id)
     {
          this.name=name;
          this.id=id;
     }
     abstract double calculate_price();
}
class Price extends Product
{
     double total,margin;
     double menu_cost;
     void getMenu(double menu_cost)
     {
         this.menu_cost=menu_cost;
     }
     void getMargin(double per)
     {
           margin=margin(per/100)*menu_cost;
     }
   public double calculate_price()
     {
         total=menu_cost+margin;
         return total;  
     }
   
}
interface Gst
{
      public static final double gst=20;
      double calGst();
}
class Mrp extends Price  implements Gst
{
      double mrp_amt,total_gst;
      public double calGst()
      {
        total_gst=(gst/100)*calculate_price(); 
        return total_gst; 
      }
       void getMrp()
      {
         mrp_amt=calculate_price()+calGst()+margin;
      }
      void show()
      {
          System.out.println("Name: "+name);
          System.out.println("Id: "+id);
          System.out.println("Cost without gst: "+calculate_price());
          System.out.println("Mrp: "+mrp_amt);
      }
}
class Multiple
{
     public static void main(String[] args)
     {
           Mrp m=new Mrp();
           m.getData("fan",101);
           m.getMenu(25);
           m.getMargin(10);
           m.getMrp();
           m.show();
     }
}

























}
