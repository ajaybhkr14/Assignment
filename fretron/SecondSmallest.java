package com.fretron;

/*
    Problem : 
    Solution Approch : 
    1.) Check what is possible data set for given problem. // Min array element required : 2 otherwise not able to find 2nd min. (throw Exception)
    2.) Think about solution.

*/

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
    
    //method
    //input 
    //output : 

}
