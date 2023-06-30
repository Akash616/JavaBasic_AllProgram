class Employee
{
   private int empid;   
   void setEmpid(int epid)
   {
       empid=epid;   
   }
    int getEmpid()
   {   
       return empid;
   }
   
}
class Customer
{
   public static void main(String[] args)
   {
        Employee e=new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
   }
}