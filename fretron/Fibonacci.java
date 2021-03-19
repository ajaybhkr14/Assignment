package com.fretron;

public class Fibonacci {
    public static void main(String gg[]){
        int a=0,b=1;
        int x=7;
        for(int i=0;i<x;i++){
            int temp =b;
            b=a+b;
            a=temp;
          System.out.println(b);
        }
       // recursion
        Fibonacci p =new Fibonacci();
       for(int i=0;i<7;i++){
          // System.out.println(p.fib(i));
       }
    }
    int fib(int x){
        if(x<=1){
            return 1;
        }
        return fib(x-1)+fib(x-2);
    }

}
