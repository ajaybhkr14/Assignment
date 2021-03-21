package com.fretron;
/*
* Problem:Implement bubble sort algorithm.
* Solution: we compare two consecutive elements starting from 0th index to the end-1 index and swap the elements
* if ar[x]>ar[x+1] .So the greatest number will be shifted to the end after first iteration the next iteration will
* be till the from 0 to end -2 as the greatest number is already in the last position.
* */
public class BubbleSort {

    void sort(int ar[]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    swap(ar,j,j+1);
                }
            }
        }
    }
    public static void main(String k[]){
    int ar[]={7,5,4,3,2,1,100};
    BubbleSort a =new BubbleSort();
    a.sort(ar);


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
