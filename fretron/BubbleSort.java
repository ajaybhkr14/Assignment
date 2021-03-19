package com.fretron;

public class BubbleSort {
    public static void main(String k[]){
    int ar[]={7,5,4,3,2,1,100};
    for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar.length-i-1;j++){
         if(ar[j]>ar[j+1]){
             swap(ar,j,j+1);
         }
        }
    }
    for(int i=0;i<ar.length;i++){
        System.out.println(ar[i]);
    }
}
static void swap(int a[],int b,int c){
        int t=a[b];
        a[b]=a[c];
        a[c]=t;
}
}
