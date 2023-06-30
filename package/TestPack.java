package com.demo.pack2;
import com.demo.pack1.Test;
public class TestPack
     {
        public static void main(String[] args)
        {
             Test obj=new Test();
             int res=obj.fact(5);
             System.out.println("factorial: "+res);
        } 
     }


/*
output

A:\javaprogram\programs>javac -d . Test.java

A:\javaprogram\programs>javac -d . Testpack.java

A:\javaprogram\programs>java com.demo.pack2.TestPack
factorial: 120

A:\javaprogram\programs>

*/