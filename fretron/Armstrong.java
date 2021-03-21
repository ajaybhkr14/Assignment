package com.fretron;
/*Problem: Write a program to check if the given number is Armstrong number or not
*Solution:  first we will count the no of digits of the given number then we multiply each digit of the number
* the number of times the length of the number and add to the variable z.
* */
public class Armstrong {
    void armstrong(int x){
        int y=x,z=0,digit=0;
        while(y!=0){
            y=y/10;
            digit++;
        }
        y=x;
        while (y!=0){
            int number=(y%10);
            int p=number;
            for(int i=1;i<digit;i++){
                p=p*number;}
            z=z+p;
            y=y/10;
        }
        System.out.println(z==x);
    }
    public static void main(String ag[]){
    int x=371;
    }
}
