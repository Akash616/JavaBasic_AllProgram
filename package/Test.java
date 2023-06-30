//if we want to access  .class file one package into another package

package com.demo.pack1;
public class Test
       {
           public int fact(int n) 
                  {
                       int f=1;
                       while(n>0)
                       {
                           f=f*n;
                           n--;
                       }   
                       return f;   
                  }
       }