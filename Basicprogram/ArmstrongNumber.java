/*wap to check for Armstrong number.
Armstrong number:- kitna number of digits hai utni hi race to the power karanga agar vo 
                   number ka equal ata hai toh vo armstrong number hota hai.
eg:-      1
     1 = 1   => armstrong number.

           2  2->4
     3<-12 = 1  2 => not armstrong number.

           3  3  3 ->9
     9<-153= 1  5  3 => armstrong number.
Armstrong number:- 0,1,153,370,371,407,----
1) find length
2) reverse of a number
-------------------------------------------------------------------------------------------------------------------
*/
class ArmstrongNumber
{
   public static void main(String[] args)
   {
        int no=153;
        int t1=no;
        int leng=0;
        while(t1 != 0)
        {
             t1=t1/10;
 
            leng=leng+1;
        }
        
        int t2=no;
        int arm=0,rem;
        while(t2 != 0)
        {
              int mul=1;
              rem=t2%10;
              for(int i=1; i<=leng; i++)        //3->3*3*3, 5->5*5*5, 1->1*1*1
              {
                   mul=mul*rem;                   
              } 
              arm=arm+mul;
              t2=t2/10;    
        }
        if(arm==no)
        {
           System.out.println(no+" is armstrong number");
        }
        else
        {
           System.out.println(no+" is not a armstrong number");
        }
   }
}



     