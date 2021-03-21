package com.fretron;
/*
*Problem:Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
*Solution :Two ways
* 1> recursion : define a function which takes int variable(x) which returns the sum of function with argument(x-1)
* and (x-2) the function returns 1 if value of argument (x) is equals or smaller than 1
*  2> using for loops : define two variables a and b use for loop to iterate assigning  b to a+b and a to b and then print b
* till the level of series to be printed
* */
public class Fibonacci {
    void fib1(int x){
        int a=0,b=1;
        for(int i=0;i<x;i++){
            int temp =b;
            b=a+b;
            a=temp;
            System.out.println(b);
        }
    }
    public static void main(String gg[]){

        int x=7;

       // recursion
        Fibonacci p =new Fibonacci();
        p.fib1(x);
       for(int i=0;i<7;i++){
           System.out.println(p.fib(i));
       }
    }
    int fib(int x){
        if(x<=1){
            return 1;
        }
        return fib(x-1)+fib(x-2);
    }

}
