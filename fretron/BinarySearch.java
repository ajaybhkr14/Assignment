package com.fretron;

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
