package com.fretron;
/*
* Problem:Write a program to find all pairs of elements in an array whose sum is equal to a specified number.
* Solution : we need two nested for loops the outer loop will take first element then will traverse the array
* in  second for loop(inner loop) starting from the next index of the outer loop and check if the sum of the
* both element is equal to the number provided by the user if yes then will print both elements.
*
* */
public class Pair {
    void pair(int ar[] , int sum){
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(sum==ar[i]+ar[j]){
                    System.out.println(ar[i]+" : "+ar[j]);
                }
            }
        }
    }

    public static void main(String o[]){
        int ar[] ={2,7,4,-5,11,5,20};
        int sum= 15;
       Pair a = new Pair();
       a.pair(ar ,sum);
    }

}
