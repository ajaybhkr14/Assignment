package com.fretron;

public class LinearSearch {
    public static void main(String f[]) {
        int ar[] = {1, 2, 4, 6, 7, 8};
        int search =4;
        for(int i=0;i<ar.length;i++){
         if(search==ar[i]){
             System.out.println(true);
         }
        }
    }
}
