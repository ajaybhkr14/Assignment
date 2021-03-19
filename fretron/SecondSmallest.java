package com.fretron;

public class SecondSmallest {

    public static void main(String ag[]){
        int ar[] = {1,2,3,4,5,6,7,-1};
        int s1=ar[0];
        int s2=ar[0];
        for(int i = 0 ;i<ar.length;i++){
            if(s1>=s2){
                s2=ar[i];
            }
            if(ar[i]<s1){
                s2=s1;
                s1=ar[i];
            }else if(ar[i]<s2){
                s2=ar[i];
            }
        }
        System.out.println(s2);
    }

}
