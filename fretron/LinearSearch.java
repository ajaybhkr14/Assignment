package com.fretron;
/*
* Problem: implement linear search
* Solution: in linear search we have to iterate the whole array and check for the number to be find
*  till we find the desired number.
* */
public class LinearSearch {
    void linear(int ar[], int search){for(int i=0;i<ar.length;i++){
        if(search==ar[i]){
            System.out.println(true);
            break;
        }
    }}
    public static void main(String f[]) {
        int ar[] = {1, 2, 4, 6, 7, 8};
        LinearSearch a =new LinearSearch();
        a.linear(ar,4);

        int search =4;

    }
}
