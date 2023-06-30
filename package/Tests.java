package com.demo.demosecond;
import com.demo.demofirst.Resource;
public class Tests extends Resource
{
    public void checkPrime(int n)
    {
        int no=7;
        int temp=0;
        for(int i=2;i<=no-1;i++)
        {
           if(no%i == 0)               
           {
                temp=temp+1;            
           }
        }
        if(temp==0)
        {
           System.out.println(no+" is prime no");
        }
        else
        {
           System.out.println(no+" is not prime no");
        }
    }
    public static void main(String [] args)
    {
       Tests t=new Tests();
       t.checkPrime(10); 
    }
}