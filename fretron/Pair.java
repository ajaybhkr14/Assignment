package com.fretron;

public class Pair {
    public static void main(String a[]){
        int ar[] ={2,7,4,-5,11,5,20};
        int sum= 15;
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(sum==ar[i]+ar[j]){
                    System.out.println(ar[i]+" : "+ar[j]);
                }
            }
        }
    }

}
