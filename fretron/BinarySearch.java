package com.fretron;
/*
* Problem: Implement binary search
* Solution: first we take the element at the mid point of the array and compare to the key (element to be searched)
* if element at mid point is greater than key then we will find the mid point taking 0 as left index and previous
*  mid point at right index .
* */
import java.util.Stack;

public class BinarySearch {
    public static void main(String aa[]) {
        int ar[]={1,2,3,4,5,6,7,8};
        BinarySearch a =new BinarySearch();
        System.out.println(a.search(ar,0,ar.length,7));
    }
    boolean search(int ar[],int l,int r,int search){
        int mid=(l+r)/2;
        if(search>ar[mid]){
            l=mid;
            return search(ar,l,r,search);
        }else if(search<ar[mid]){
            r=mid;
            return search(ar,l,r,search);
        }
        else if(search==ar[mid]){
            return true;
        }
        else{
            return false;
        }
    }
}
